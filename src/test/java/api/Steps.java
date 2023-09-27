package api;

import org.example.Credentials;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;
import org.example.api.entities.responses.add.AddResponseBody;
import org.example.api.entities.responses.login.LoginResponseBody;
import org.example.api.entities.responses.search.SearchResponseBody;
import org.example.api.logic.ApiRequests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Steps {
    private final String email = Credentials.username;
    private final String password = Credentials.password;
    @Test
    public void loginTest() throws IOException {
        LoginRequestBody cred = new LoginRequestBody(null, email, password, false);
        LoginResponseBody responseBody = ApiRequests.loginReq(cred);
        assumeTrue(200 == responseBody.getStatusCode());
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
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
