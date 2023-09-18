package org.example.ui.logic.context;

import org.openqa.selenium.WebDriver;

public class TestContext {
        private WebDriver driver;
        public TestContext(){}
        TestContext(WebDriver driver){
            this.driver = driver;
        }
        public WebDriver getDriver() {
            return driver;
        }

        public void setDriver(WebDriver driver) {
            this.driver = driver;
        }
}
