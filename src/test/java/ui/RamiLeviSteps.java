package ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Credentials;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.components.AsideCart;
import org.example.ui.logic.components.Header;
import org.example.ui.logic.components.LoginPage;
import org.example.ui.logic.context.TestContext;
import org.example.ui.logic.pages.HomePage;
import org.example.ui.logic.pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RamiLeviSteps {
    private static final String URL_LINK = "https://www.rami-levy.co.il/he";

    private TestContext context;
    public RamiLeviSteps(){}
    public RamiLeviSteps(TestContext context) {
        this.context = context;
    }
    @Given("I have navigated to Rami Levi")
    public void iHaveNavigatedToRamiLevi() {
        DriverManager driverManager = new DriverManager();
        context.put("DriverManager", driverManager);
        HomePage homePage = driverManager.createPage(HomePage.class, URL_LINK);
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
    @Then("On Rami Levi home page - '{}'")
    public void onRamiLeviHomePageFoad(String name) {
        DriverManager driverManager = context.get("DriverManager");
        HomePage homePage = driverManager.getCurrentPage();
        String currentText = homePage.getLoginUserText();

        int retries=0;
        while(!currentText.equals(name) && retries < 10){
            currentText = homePage.getLoginUserText();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertEquals(name, currentText);
    }

    @When("I search for item {string}")
    public void iSearchForItem(String input) {
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(Header.class);
        Header header = driverManager.getCurrentPage();
        header.search_For_Item(input);
    }

    @When("I add items to cart {int}")
    public void iAddItemsToCart(int count) {
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(ProductPage.class);
        ProductPage productPage = driverManager.getCurrentPage();
        productPage.addItems(count);
    }

    @Then("I have {int} items in the cart")
    public void iHaveItemsInTheCart(int count) {
        DriverManager driverManager = context.get("DriverManager");
        driverManager.createPage(AsideCart.class);
        AsideCart asideCart = driverManager.getCurrentPage();
        assertEquals(count,asideCart.getItemsInCart().size() -1);

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
        driverManager.createPage(HomePage.class);
        HomePage homePage = driverManager.getCurrentPage();
        boolean flag = false;
        if (homePage.checkCartIsEmpty() !=null){
            flag = true;
        }
        assertTrue(flag);

    }
}
