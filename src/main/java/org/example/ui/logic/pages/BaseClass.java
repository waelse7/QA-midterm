package org.example.ui.logic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    // class elements
    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * constructor to initialize the driver of the class
     * @param driver
     */
    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * function to find elements in the browser
     * @param locator
     * @return
     */
    protected WebElement findWithWait(By locator){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
