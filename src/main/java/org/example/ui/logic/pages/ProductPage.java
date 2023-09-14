package org.example.ui.logic.pages;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BaseClass {
   // private final By ADD_BUTTON = By.xpath("//button[contains(@class,\"focus-item btn-acc plus no-select\")");
    private final By ADD_BUTTON = By.cssSelector(".focus-item.btn-acc.plus.no-select");
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //initiate a list of items in the product page once the search word is entered
    List<WebElement> products = driver.findElements(By.cssSelector(".min-height-product"));

    //a list of all the Add buttons in the products;
    List<WebElement> buttons = new ArrayList<>();

    //finds the Add buttons and adds them to the list of buttons
//    public void findAddBtn() {
//        for (WebElement product: products) {
//            WebElement button = product.findElement(By.cssSelector(".btn-acc"));
//            buttons.add(button);
//        }
//    }
    // TODO - add func with filter for "text()"
    public void addItems() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        for (WebElement product : products) {
         //   Actions action = new Actions(driver);
        //    action.moveToElement(product);
            WebElement addButton = product.findElement(ADD_BUTTON); // Update the locator as needed
         //   action.moveToElement(addButton);
        //    action.click().build().perform();
            addButton.click();
        }

    }

    //adds items to the cart
    public void addItems(int number_of_Products_To_Add) {
        int clicks = 0;

        for (WebElement btn : buttons) {
            if (clicks < number_of_Products_To_Add) {
                btn.click();
                clicks++;
            } else {
                break;
            }
        }
    }



}
