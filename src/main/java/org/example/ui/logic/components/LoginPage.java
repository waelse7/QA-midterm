package org.example.ui.logic.components;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

    // locators
    private By userInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("//button[@aria-label='כניסה']");

    /**
     * Constructor to initialize the class
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * login function that fill the username and password
     * @param user
     * @param password
     */
    public void login(String user, String password) {
        driver.findElement(userInput).sendKeys(user);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }


}
