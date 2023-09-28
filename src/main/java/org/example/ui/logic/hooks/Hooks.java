package org.example.ui.logic.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.context.TestContext;
import org.openqa.selenium.WebDriver;

import static org.example.ui.infra.DriverManager.takeScreenshot;

public class Hooks {
    private static TestContext testContext;
    private static final int SLEEP_TIME = 3000;

    public Hooks() {
    }

    public Hooks(TestContext testcontext) {
        testContext = testcontext;
    }

    @Before
    public void beforeScenario() throws InterruptedException {
        testContext = new TestContext();
        WebDriver driver = DriverManager.initializeDriver();
    }

    @After
    public static void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario.getName());
        }
        testContext = null;
        DriverManager.quitDriver();

    }
}
