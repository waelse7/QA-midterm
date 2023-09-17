package org.example.ui.logic.pages;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BaseClass {
    // locators
    // private final By ADD_BUTTON = By.xpath("//button[contains(@class,\"focus-item btn-acc plus no-select\")");
    private final By ADD_BUTTON = By.cssSelector(".focus-item.btn-acc.plus.no-select");
    private final By ADD_BUTTON2 = By.cssSelector(".focus-item.btn-acc.plus.no-select");
    private final By PRODUCT_CARD = By.cssSelector(".min-height-product");
    private List<WebElement> products;
    private List<WebElement> buttons;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        init();
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private void init(){
        products = new ArrayList<>();
        buttons = new ArrayList<>();
        findAddBtn();
    }

   // finds the Add buttons and adds them to the list of buttons
    public void findAddBtn() {
        try {
            Thread.sleep(Duration.ofSeconds(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        products = driver.findElements(PRODUCT_CARD);
        for (WebElement product: products) {
            WebElement button = product.findElement(ADD_BUTTON2);
            buttons.add(button);
        }
    }
    // TODO - add func with filter for "text()"
    public void addItemByName(String name){
    }

    //add all items to the cart
    public void addItems() {
        for (WebElement product : products) {
            Actions action = new Actions(driver);
            action.moveToElement(product);
            WebElement addButton = product.findElement(By.cssSelector(".btn-acc")); // Update the locator as needed
            action.moveToElement(addButton);
            action.click().build().perform();
        }

    }

    //add certain amount of items to the cart
    public void addItems(int number_of_Products_To_Add) {

        int clicks = 0;

        for (WebElement btn : buttons) {
            if (clicks < number_of_Products_To_Add) {
                btn.click();
                clicks++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
    }


}
