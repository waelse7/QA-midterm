package ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.components.LoginPage;
import org.example.ui.logic.context.TestContext;
import org.example.ui.logic.pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @When("On login popup - I login with user '{}' and password '{}'")
    public void iLoginWithUserTzahiTzahiComAndPasswordAa(String user, String password) {
        DriverManager driverManager = context.get("DriverManager");
        LoginPage page = driverManager.getCurrentPage();
        page.login(user, password);
        driverManager.createPage(HomePage.class);
    }
    @Then("On Rami Levi home page - '{}'")
    public void onRamiLeviHomePageTzahi(String name) {
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
}
