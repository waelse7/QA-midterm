package org.example.ui.logic.context;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;


public class TestContext {
    private WebDriver driver;
    private HashMap<String, Object> map;

    public TestContext() {
        this.map = new HashMap<>();
    }

    TestContext(WebDriver driver) {
        this.driver = driver;
        this.map = new HashMap<>();
    }

    public <T> T get(String key) {
        Object item = map.get(key);
        if (item != null) {
            return (T) item;
        } else {
            throw new IllegalArgumentException("Item not found in context");
        }
    }

    public void put(String key, Object item) {
        map.put(key, item);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
