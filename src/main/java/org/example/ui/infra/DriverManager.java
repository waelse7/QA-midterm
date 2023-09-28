package org.example.ui.infra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.example.ui.logic.pages.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DriverManager {
    private static WebDriver driver;
    private BaseClass currentPage;

    /**
     * function to initialize the driver
     * @return driver
     */
    public static WebDriver initializeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();// to make sure the name won't disappear after login
        }
        return driver;
    }

    /**
     * a function used to create the pages that don't need url
     * @param pageType
     * @return
     * @param <T>
     */
    public <T extends BaseClass> T createPage(Class<T> pageType){
        return createPage(pageType, null);
    }

    /**
     *  a function used to create the pages that needs url
     * @param pageType
     * @param url
     * @return
     * @param <T>
     */
    public <T extends BaseClass> T createPage(Class<T> pageType, String url){
        try {
            Constructor<T> constructor = pageType.getConstructor(WebDriver.class);
            if(url!=null){
                driver.get(url);
            }
            T page = constructor.newInstance(driver);
            currentPage = page;
            return page;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("relevant constructor not found", e);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * function to return the current page that was created
     * @return
     * @param <T>
     */
    public <T extends BaseClass> T getCurrentPage(){
        return (T)currentPage;
    }

    /**
     * function to take screenshot of the webpage when test fail before closing the browser
     * @param sceneName
     */
    public static void takeScreenshot(String sceneName) {
        // Capture a screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        try {
            // Specify the file path where you want to save the screenshot
            FileUtils.copyFile(screenshot, new File(String.format("screenshot_%s_%s.png", sceneName, LocalDateTime.now().format(format))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * function uses the driver to go for a website using the url param
     * @param url
     */
    public static void getTo(String url) {
        driver.get(url);
    }

    /**
     * function to close the driver
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.close();
        }
        driver = null;
    }

    /**
     * function to return the driver we are using
     * @return
     */
    public static WebDriver getDriver() {
        return driver;
    }
}
