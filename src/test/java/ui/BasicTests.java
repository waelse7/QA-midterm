//package ui;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.example.ui.infra.DriverManager;
//import org.example.ui.logic.components.AsideCart;
//import org.example.ui.logic.components.Header;
//import org.example.ui.logic.context.TestContext;
//import org.example.ui.logic.pages.HomePage;
//import org.example.ui.logic.pages.ProductPage;
//import org.junit.jupiter.api.AfterEach;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class BasicTests {
//    private static final String URL_LINK = "https://www.rami-levy.co.il/he";
//    private static final String EMAIL = "4everqatesting@gmail.com";
//    private static final String PASSWORD = "fouad123321";
////    private static final String SEARCH_INPUT = "????????";
//    private WebDriver driver;
//    private WebDriverWait wait;
//    private TestContext context;
//
//    private HomePage homePage;
//    private Header header;
//    private ProductPage productPage;
//    private AsideCart cart;
//
//    public BasicTests(){}
//    public BasicTests(TestContext context){
//        this.context = context;
//    }
//    @Before
//    public void setUp(){
//        DriverManager driverManager = new DriverManager();
//        context.put("DriverManager", driverManager);
//        HomePage homePage = driverManager.createPage(HomePage.class, URL_LINK);
//        driver = DriverManager.initializeDriver(context);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//    @AfterEach
//    public void breakBetween() throws InterruptedException {
//        Thread.sleep(Duration.ofSeconds(5));
//    }
//    @Given("I am on the RamiLevi website")
//    public void iAmOnTheRamiLeviWebsite() {
//        driver.get(URL_LINK);
//        homePage = new HomePage(driver, wait);
//        header = new Header(driver, wait);
//        productPage = new ProductPage(driver, wait);    }
//    @When("I log in to the website")
//    public void login() throws InterruptedException {
//        homePage.login(EMAIL, PASSWORD);
//    }
//
//    @When("invalid log in to the website")
//    public void invalidLogInToTheWebsite() {
//        homePage.login(EMAIL, "blabla");
//    }
//    @And("I am logged in")
//    public void iAmLoggedIn() {
//       // assertFalse(homePage.isInvalidMessageExists(), "login failed");
//    }
//    @When("I toggle dark mode")
//    public void darkmode(){
//        header.activateDarkMode();
//    }
//    @When("I search for item {string}")
//    public void searchForItem(String input)
//    {
//        header.search_For_Item(input);
//    }
//
//    @When("I add items to cart {int}")
//    public void addItemsToCart(int count){
//        productPage.addItems(count);
//        cart = new AsideCart(driver, wait);
//    }
//
//    @When("I remove items from side cart")
//    public void removeItems(){
//        cart.clickRemoveItems();
//    }
//
//    @And("The cart is empty")
//    public void theCartIsEmpty() {
//        assertEquals(0,cart.getItemsInCart().size());
//    }
//
//    @And("I have {int} items in the cart")
//    public void iHaveItemsInTheCart(int total) {
//        assertEquals(total,cart.getItemsInCart().size());
//    }
//}
//
