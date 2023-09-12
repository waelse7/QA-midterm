package org.example.ui.infra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTesting {
    public static void main(String[] args) throws InterruptedException {
        String email = "4everqatesting@gmail.com";
        String password = "fouad123321";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rami-levy.co.il/he");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        HomePage page = new HomePage(driver, wait);
        page.login(email, password);
        Header header = new Header(driver, wait);
        header.search_For_Item("קורנפלקס");
        header.activateDarkMode();
        Thread.sleep(3000);
        ProductPage productPage = new ProductPage(driver, wait);
        Thread.sleep(3000);
        productPage.findAddBtn();
        Thread.sleep(3000);
        productPage.addItems(5);
        Thread.sleep(3000);
        AsideCart cart = new AsideCart(driver, wait);
        cart.cartSize();

    }
}
