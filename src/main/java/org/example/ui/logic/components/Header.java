package org.example.ui.logic.components;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends BaseClass {
    private final String SEARCH_BAR = "destination";
    private final String DARK_MODE = "open-popup-acc";

    public Header(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        init();
    }
    public Header(WebDriver driver) {
        super(driver);
        init();
    }
    private WebElement searchBar;
    private WebElement darkMode;

    public void init() {
        this.searchBar = findWithWait(By.id(SEARCH_BAR));
        this.darkMode = findWithWait(By.id(DARK_MODE));
    }

    //Searches for a specific elements
    public void search_For_Item(String item_name) {;
        searchBar.click();
        searchBar.sendKeys(item_name);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void activateDarkMode() {
        darkMode.click();
    }

}
