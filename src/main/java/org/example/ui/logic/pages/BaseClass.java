package org.example.ui.logic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findWithWait(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
