package org.example.ui.infra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AsideCart extends BaseClass {
    private final String CART_ID = "//*[@id=\"market\"]/ul"; //XPath selector
    private final String removeX = "//*[@id=\"item-1-0\"]/div/div/span[2]/a"; //cssSelector


    public AsideCart(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        init();
    }

    public AsideCart(WebDriver driver) {
        super(driver);
        init();
    }

    WebElement cart;

    public void init() {
        this.cart = findWithWait(By.xpath(CART_ID));
    }



    List<WebElement> itemsInCart = new ArrayList<>(); // item in cart
    List<WebElement> removeBtn = new ArrayList<>();
    public void cartSize() {
        itemsInCart = cart.findElements(By.tagName("li"));
        System.out.println(itemsInCart.size());
    }

    public void removeFromCart() {
        String partialID = "cart-product";
        for (WebElement ele: itemsInCart) {
            WebElement remove = ele.findElement(By.cssSelector(".focus-item.remove-item"));
            removeBtn.add(remove);
        }
        System.out.println(removeBtn.size());
    }
}
