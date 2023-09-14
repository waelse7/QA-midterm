package org.example.ui.test;

import org.example.ui.infra.DriverManager;
import org.example.ui.logic.components.AsideCart;
import org.example.ui.logic.components.Header;
import org.example.ui.logic.pages.HomePage;
import org.example.ui.logic.pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTesting {
    private static final String EMAIL = "4everqatesting@gmail.com";
    private static final String PASSWORD = "fouad123321";
    private static final String SEARCH_INPUT = "קורנפלקס";
    private static final int SLEEP_TIME = 3000;

    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //login
        driver = DriverManager.initializeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        HomePage page = new HomePage(driver, wait);
        page.login(EMAIL, PASSWORD);

        // dark mode and buy add items
        Header header = new Header(driver, wait);
        header.search_For_Item(SEARCH_INPUT);
        header.activateDarkMode();
        Thread.sleep(SLEEP_TIME);
        //add products
        ProductPage productPage = new ProductPage(driver, wait);
        Thread.sleep(SLEEP_TIME);
   //     productPage.addItems();
  //      Thread.sleep(SLEEP_TIME);

        productPage.addItems(5);
        Thread.sleep(SLEEP_TIME);
        //remove products
        AsideCart cart = new AsideCart(driver, wait);
        cart.cartSize();

      //  cart.removeItems();
        cart.clickRemoveItems();
        driver.quit();
    }

}
