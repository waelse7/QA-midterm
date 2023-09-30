package org.example.ui.logic.components;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class AsideCart extends BaseClass {
    //locators
    private final By CART_ID = By.xpath("//*[@id=\"market\"]/ul");
    private final By REMOVE_BUTTON = By.xpath("//a[contains(@class,\"focus-item remove-item position-absolute top-0\")]");

    //class elements
    private WebElement cart;
    private List<WebElement> itemsInCart;

    /**
     * Constructor initialize class
     * @param driver
     */
    public AsideCart(WebDriver driver) {
        super(driver);
        init();
    }

    /**
     * initialize the cart and add items to list
     */
    public void init() {
        this.cart = findWithWait(CART_ID);
        itemsInCart = new ArrayList<>();
        itemsInCart = cart.findElements(By.tagName("li"));
    }

    /**
     * getter function to get items in cart
     * @return
     */
    public List<WebElement> getItemsInCart() {
        return itemsInCart;
    }

    /**
     * remove items function that move on all the elements in the list
     * hover on the top item and click on the remove item
     */
    public void clickRemoveItems() {
        Actions action = new Actions(driver);
        for (int i = 0; i < itemsInCart.size() - 1; i++) {
            action.moveToElement(itemsInCart.get(0)).perform(); // hover over product
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement remove = findWithWait(REMOVE_BUTTON);
            remove.click();
        }
    }
    public boolean checkItemsInCart(String name){
        for (int i = 0; i < itemsInCart.size() -1; i++){
            if (!itemsInCart.get(i).getText().contains(name)){
                return false;
            }
        }
        return true;
    }


}
