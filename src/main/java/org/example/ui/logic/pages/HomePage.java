package org.example.ui.logic.pages;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class HomePage extends BaseClass {

    private final String SIGN_IN_BTN = "//*[@id=\"login-user\"]"; //by ID
    private final String USERNAME = "//*[@id=\"email\"]"; //xPath
    private final String PASSWORD = "//*[@id=\"password\"]"; //xpath
    private final String LOGIN_BTN = "//*[@id=\"__BVID__256___BV_modal_body_\"]/div/div[2]/div/div/div[2]/button"; //by Xpath
    private final By INVALID_USER_MESSAGE =By.xpath( "//*[@id=\"__BVID__389___BV_modal_body_\"]/div/div[2]/div/div/div[2]/div[3]"); //by Xpath


    private WebElement Sign;
    private WebElement invalidMessage;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        initPage();
    }

    public HomePage(WebDriver driver) {
        super(driver);
        initPage();
    }

    //initialize home page elements
    public void initPage() {
        Sign = findWithWait(By.xpath(SIGN_IN_BTN));
    }

    public void clickLogin(){
        Sign.click();
    }

    // The log in function using selenium UI
    public void login(String email, String pass) {
        Sign.click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        WebElement usernameField = findWithWait(By.id("email"));
        WebElement passwordField = findWithWait(By.id("password"));
        usernameField.sendKeys(email);
        passwordField.sendKeys(pass);
        passwordField.sendKeys(Keys.ENTER);
        driver.switchTo().window(mainWindowHandle);

    }

    //TODO: if not found pass and dont throw error
    public boolean isInvalidMessageExists(){
        invalidMessage = findWithWait(INVALID_USER_MESSAGE);
        return invalidMessage != null;
    }


    public String getLoginUserText() {
        return Sign.getText();
    }
}