package org.example.ui.logic.components;

import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends BaseClass {
    // locators
    private final By SEARCH_BAR = By.id("destination");
    private final By DARK_MODE = By.id("open-popup-acc");
    private WebElement searchBar;
    private WebElement darkMode;

    /**
     * Constructor initialize class
     * @param driver
     */
    public Header(WebDriver driver) {
        super(driver);
        init();
    }

    /**
     * initialize class elements
     */
    public void init() {
        this.searchBar = findWithWait(SEARCH_BAR);
        this.darkMode = findWithWait(DARK_MODE);
    }

    /**
     * this function to search for specific item in the search bar
     * @param item_name
     */
    public void search_For_Item(String item_name) {;
        searchBar.click();
        searchBar.sendKeys(item_name);
        searchBar.sendKeys(Keys.ENTER);
    }

    /**
     * function to activate the dark mode
     */
    public void activateDarkMode() {
        darkMode.click();
    }

}
