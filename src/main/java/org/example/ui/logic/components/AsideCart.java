package org.example.ui.logic.components;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AsideCart extends BaseClass {
    private final String CART_ID = "//*[@id=\"market\"]/ul"; //XPath selector
    //private final String removeX = "//*[@id=\"item-1-0\"]/div/div/span[2]/a"; //cssSelector
    private final By REMOVE_BUTTON = By.xpath("//a[contains(@class,\"focus-item remove-item position-absolute top-0\")]");
    private WebElement cart;

    public List<WebElement> getItemsInCart() {
        return itemsInCart;
    }

    private List<WebElement> itemsInCart;
    public AsideCart(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        init();
    }

    public AsideCart(WebDriver driver) {
        super(driver);
        init();
    }

    public void init() {
        this.cart = findWithWait(By.xpath(CART_ID));
        itemsInCart = new ArrayList<>();
    }


   // List<WebElement> removeBtn = new ArrayList<>();
    public void cartSize() {
        itemsInCart = cart.findElements(By.tagName("li"));
    }

    public void clickRemoveItems(){
        for (WebElement ele: itemsInCart) {
            System.out.println(ele.getText());
            WebElement remove = findWithWait((REMOVE_BUTTON));
            remove.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void removeItems(int len){
        for (int i = 0; i < len; i++){
            WebElement ele = itemsInCart.get(i);
            WebElement remove = ele.findElement(REMOVE_BUTTON);
            remove.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
//    public void removeFromCart() {
//        String partialID = "cart-product";
//        for (WebElement ele: itemsInCart) {
//            WebElement remove = ele.findElement(By.cssSelector(".focus-item.remove-item"));
//            removeBtn.add(remove);
//        }
//        System.out.println(removeBtn.size());
//    }
}
