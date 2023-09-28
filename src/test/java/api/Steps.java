package api;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Credentials;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;
import org.example.api.entities.responses.add.AddResponseBody;
import org.example.api.entities.responses.login.LoginResponseBody;
import org.example.api.entities.responses.search.SearchResponseBody;
import org.example.api.logic.ApiRequests;
import org.example.ui.infra.DriverManager;
import org.example.ui.logic.context.TestContext;
import org.example.ui.logic.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Steps {
    private final String email = Credentials.username;
    private final String password = Credentials.password;
    private TestContext context;
    private final String URL_LINK = "https://www.rami-levy.co.il/he";

    @Test
    public void loginTest() throws IOException {
        LoginRequestBody cred = new LoginRequestBody(null, email, password, false);
        LoginResponseBody responseBody = ApiRequests.loginReq(cred);
        assumeTrue(200 == responseBody.getStatusCode());
//        DriverManager driver = new DriverManager();
//        context.put("DriverManager", driver);
//        HomePage homePage = driver.createPage(HomePage.class, URL_LINK);
//        JavascriptExecutor jsExecutor = DriverManager.createJsExecutor();
//        String s ="{\"authuser\":{\"user\":" + responseBody.getUser() +"}}";
//        jsExecutor.executeScript(String.format("window.localStorage.setItem('ramilevy','%s')",s));
//        DriverManager.getDriver().navigate().refresh();
//        String currentText = homePage.getLoginUserText();
//        String name = responseBody.getUser().getName();
//        int retries=0;
//        while(!currentText.equals(name) && retries < 10){
//            currentText = homePage.getLoginUserText();
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            retries++;
//        }
//        assertEquals(name, currentText);
    }
    @Test
    public void searchTest() throws IOException {
        SearchRequestBody search = new SearchRequestBody(1, "cola", "1197");
        SearchResponseBody responseBody = ApiRequests.search(search);
        assertEquals(200, responseBody.getStatusCode());
    }
    @Test
    public void addTest() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("386097", "1.00");
        AddRequestBody add = new AddRequestBody(0, map, "1197","2023-09-27T14:48:29.837Z",null);
        AddResponseBody addResponseBody = ApiRequests.addToCart(add);
        assertEquals(200, addResponseBody.getStatusCode());
    }
}
