package org.example.ui.infra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BaseClass{
    private final String ADD = "Capa_1";
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
    public void findAddBtn() {
        for (WebElement product: products) {
            WebElement button = product.findElement(By.cssSelector(".btn-acc"));
            buttons.add(button);
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
