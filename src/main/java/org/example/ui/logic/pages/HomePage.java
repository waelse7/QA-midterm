package org.example.ui.logic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BaseClass {

    //locators
    private final String SIGN_IN_BTN = "//*[@id=\"login-user\"]"; //by ID
    private final String LOGIN_BTN = "//*[@id=\"__BVID__256___BV_modal_body_\"]/div/div[2]/div/div/div[2]/button"; //by Xpath
    private final By INVALID_USER_MESSAGE =By.xpath( "//*[@id=\"__BVID__389___BV_modal_body_\"]/div/div[2]/div/div/div[2]/div[3]"); //by Xpath

    private final By EMPTY_CART = By.xpath("//*[@id=\"online-cart-wrap\"]/div/div/div/div[1]/div/div[1]");
    private WebElement Sign;

    private WebElement cartEmpty;

    /**
     * constructor initialize the page
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
        initPage();
    }

    /**
     * initialize home page elements
     */
    public void initPage() {
        Sign = findWithWait(By.xpath(SIGN_IN_BTN));
    }

    /**
     * click login
     */
    public void clickLogin(){
        Sign.click();
    }

    /**
     * get the name to make sure we logged in successfully
     * @return
     */
    public String getLoginUserText() {
        Sign = findWithWait(By.xpath(SIGN_IN_BTN));
        return Sign.getText();
    }

    public WebElement checkCartIsEmpty(){
       return cartEmpty = findWithWait(EMPTY_CART);
    }
}