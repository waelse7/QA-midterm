import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Credentials;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;
import org.example.api.entities.responses.add.AddResponseBody;
import org.example.api.entities.responses.login.LoginResponseBody;
import org.example.api.entities.responses.search.SearchResponseBody;
import org.example.api.logic.ApiRequests;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.components.AsideCart;
import org.example.ui.logic.components.LoginPage;
import org.example.ui.logic.context.TestContext;
import org.example.ui.logic.pages.HomePage;
import org.example.ui.logic.pages.ProductPage;
import org.openqa.selenium.JavascriptExecutor;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Steps {
    private final String email = Credentials.username;
    private final String password = Credentials.password;
    private TestContext context;
    private final String URL_LINK = "https://www.rami-levy.co.il/he";
    public Steps(TestContext context) {
        this.context = context;
    }


    @Given("I am on rami levi homepage.")
    public void onHomePage(){
        DriverManager driver = new DriverManager();
        context.put("DriverManager", driver);
        HomePage homePage = driver.createPage(HomePage.class, URL_LINK);
    }
    @When("On Rami Levi home page - I click login")
    public void onRamiLeviHomePageIClickLogin() {
        DriverManager driverManager = context.get("DriverManager");
        HomePage page = driverManager.getCurrentPage();
        page.clickLogin();
        driverManager.createPage(LoginPage.class);
    }
    @When("On login popup - I login")
    public void iLoginWithUserNameAndPassword() {
        DriverManager driverManager = context.get("DriverManager");
        LoginPage page = driverManager.getCurrentPage();
        page.login(Credentials.username, Credentials.password);
        driverManager.createPage(HomePage.class);
    }
    @Then("I see the user name element on the page.")
    public void assertValidLogin(){
        DriverManager driverManager = context.get("DriverManager");
        HomePage homePage = driverManager.getCurrentPage();
        String currentText = homePage.getLoginUserText();
        int retries=0;
        while(!currentText.equals("fouad") && retries < 10){
            currentText = homePage.getLoginUserText();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertEquals("fouad", currentText);
    }

    @When("On login popup - I login with wrong credentials")
    public void iLoginWithWrongUserNameAndPassword() {
        DriverManager driverManager = context.get("DriverManager");
        LoginPage page = driverManager.getCurrentPage();
        page.login("pop", "12334");
        driverManager.createPage(HomePage.class);
    }

    @Then("I don't see the user name element on the page.")
    public void assertInvalidLogin(){
        DriverManager driverManager = context.get("DriverManager");
        HomePage homePage = driverManager.getCurrentPage();
        String currentText = homePage.getLoginUserText();
        assertEquals("התחברות", currentText);
    }

    @When("I search for {string}.")
    public void searchForItem(String item) throws IOException {
        DriverManager driverManager = context.get("DriverManager");
        SearchRequestBody search = new SearchRequestBody(1, item, "1197");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
        String tokenAndUserData = (String) jsExecutor.executeScript("return window.localStorage.getItem('ramilevy');");

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper.readTree(tokenAndUserData);
       // String tokenText = node.get("authuser").get("user").get("token").asText();
        String tokenText = node.get("authuser").get("user").get("token").textValue();

        HashMap<String, String> token = new HashMap<>();
        token.put("Ecomtoken", tokenText);

        SearchResponseBody responseBody = ApiRequests.search(search, token);
        assumeTrue(200 == responseBody.getStatusCode());
    }

    @Then("I see the {string} on the search page.")
    public void lookForItem(String item){
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(ProductPage.class);
        ProductPage productPage = driverManager.getCurrentPage();
        productPage.checkItems(item);
    }



    @When("add items to the cart.")
    public void addTest() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("386097", "1.00");
        AddRequestBody add = new AddRequestBody(0, map, "1197","2023-09-27T14:48:29.837Z",null);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
        String tokenAndUserData = (String) jsExecutor.executeScript("return window.localStorage.getItem('ramilevy');");

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper.readTree(tokenAndUserData);
        String tokenText = node.get("authuser").get("user").get("token").asText();

        HashMap<String, String> token = new HashMap<>();
        token.put("Ecomtoken", tokenText);

        AddResponseBody addResponseBody = ApiRequests.addToCart(add, token);
        assumeTrue(200 == addResponseBody.getStatusCode());
    }

    @Then("I see {string} in the cart")
    public void checkItemsInCart(String name){
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(AsideCart .class);
        AsideCart asideCart = driverManager.getCurrentPage();
        asideCart.checkItemsInCart(name);
    }

    @When("I remove items from side cart")
    public void iRemoveItemsFromSideCart() {
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(AsideCart.class);
        AsideCart asideCart = driverManager.getCurrentPage();
        asideCart.clickRemoveItems();
    }
    @Then("The cart is empty")
    public void theCartIsEmpty() {
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(AsideCart.class);
        AsideCart asideCart = driverManager.getCurrentPage();
        assertEquals(0,asideCart.getItemsInCart().size() -1);

    }

}
