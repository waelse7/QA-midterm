package org.example.api.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;

import org.example.api.entities.responses.add.AddResponseBody;
import org.example.api.entities.responses.login.LoginResponseBody;
import org.example.api.entities.responses.search.SearchResponseBody;
import org.example.api.infra.HttpFacade;
import org.example.api.infra.RequestMethods;

import java.io.IOException;

public class ApiRequests {
    private static final String logInString = "https://api-prod.rami-levy.co.il/api/v2/site/auth/login";
    private final String searchString = "https://www.rami-levy.co.il/api/catalog";
    private static final String addToCartString = "https://www.rami-levy.co.il/api/v2/cart";

    private static HttpFacade facade = new HttpFacade();

    public static AddResponseBody addToCart(AddRequestBody addRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(addRequestBody);
        return facade.httpRequest(new AddResponseBody(), addToCartString, RequestMethods.POST, json);
    }
    public static LoginResponseBody loginReq(LoginRequestBody loginRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(loginRequestBody);
        return facade.httpRequest(new LoginResponseBody(), logInString, RequestMethods.POST, json);
    }
    public static SearchResponseBody search(SearchRequestBody searchRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(searchRequestBody);
        return facade.httpRequest(new SearchResponseBody(), addToCartString, RequestMethods.POST, json);
    }
}
