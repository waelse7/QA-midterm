package ui;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicTests {
    private static final String EMAIL = "4everqatesting@gmail.com";
    private static final String PASSWORD = "fouad123321";
    private static final String SEARCH_INPUT = "????????";
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp(){
        driver = DriverManager.initializeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given("I am loged in to the website")
    public void login(){
        HomePage page = new HomePage(driver, wait);
        page.login(EMAIL, PASSWORD);
    }
    @When("I toggle darkmode")
    public void darkmode(){

    }

}

