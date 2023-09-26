package api;

import org.example.Credentials;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.responses.login.LoginResponseBody;
import org.example.api.logic.ApiRequests;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Steps {
    private final String email = Credentials.username;
    private final String password = Credentials.password;
    @Test
    public void test() throws IOException {
        LoginRequestBody cred = new LoginRequestBody(null, email, password, false);
        LoginResponseBody responseBody = ApiRequests.loginReq(cred);
        assumeTrue(200 == responseBody.getStatusCode());
        
    }
}
