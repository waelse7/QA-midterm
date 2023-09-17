package org.example.ui.infra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.example.ui.logic.context.TestContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DriverManager {
    private static WebDriver driver;
//    private static final String URL_LINK = "https://www.rami-levy.co.il/he";

    public static WebDriver initializeDriver(TestContext testContext) {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            testContext.setDriver(driver);
        }
        return driver;
    }

    public static void takeScreenshot(String scenName) {
        // Capture a screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        try {
            // Specify the file path where you want to save the screenshot
            FileUtils.copyFile(screenshot, new File(String.format("screenshot_%s_%s.png", scenName, LocalDateTime.now().format(format))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getTo(String url) {
        driver.get(url);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.close();
        }
        driver = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
