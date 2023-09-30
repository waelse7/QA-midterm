package org.example.ui.logic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BaseClass {
    // locators
    // private final By ADD_BUTTON = By.xpath("//button[contains(@class,\"focus-item btn-acc plus no-select\")");
    private final By ADD_BUTTON = By.cssSelector(".focus-item.btn-acc.plus.no-select");
    private final By PRODUCT_CARD = By.cssSelector(".min-height-product");
    private final By POPUP_CLOSE_BUTTON = By.id("close-popup");
    private List<WebElement> products;
    private List<WebElement> buttons;

    /**
     * constructor to init class
     * @param driver
     */
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addItems(int count) {
        products = new ArrayList<>();
        buttons = new ArrayList<>();
        int clicks = 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        products = driver.findElements(PRODUCT_CARD);
        for (WebElement product: products) {
            //Performing the mouse hover action on the target element.
            if (clicks < count) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                action.moveToElement(product).perform(); // hover over product
                WebElement button = product.findElement(ADD_BUTTON);
                button.click();
                clicks++;
                // check if popup appears and close it
                if (!driver.findElements(POPUP_CLOSE_BUTTON).isEmpty()){
                    WebElement popup = driver.findElement(POPUP_CLOSE_BUTTON);
                    popup.click();
                }

            } else {
                break;
            }
        }
    }

    public boolean checkItems(String name) {
        products = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (!products.get(i).getText().contains(name)){
                return false;
            }
        }
        return true;
    }


    // TODO - add func with filter for "text()"
    public void addItemByName(String name){

    }

}
