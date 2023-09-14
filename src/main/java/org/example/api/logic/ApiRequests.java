package org.example.api.logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;
import org.example.api.entities.responses.AddToCartResponse.AddResponseBody;
import org.example.api.entities.responses.LoginResponse.LoginResponse;
import org.example.api.infra.HttpFacade;
import org.example.api.infra.RequestMethods;

import java.io.IOException;

public class ApiRequests {
    private String logInString = "https://api-prod.rami-levy.co.il/api/v2/site/auth/login";
    private String searchString = "https://www.rami-levy.co.il/api/catalog?";
    private static String addToCartString = "https://www.rami-levy.co.il/api/v2/cart";

    private static HttpFacade facade = new HttpFacade();

    public static AddResponseBody addToCart(AddRequestBody addRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(addRequestBody);
        return facade.httpRequest(new AddResponseBody(), addToCartString, RequestMethods.POST, json);
    }
    public static LoginResponse addToCart(LoginRequestBody loginRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(loginRequestBody);
        return facade.httpRequest(new LoginResponse(), addToCartString, RequestMethods.POST, json);
    }
    public static AddResponseBody addToCart(SearchRequestBody searchRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(searchRequestBody);
        return facade.httpRequest(new AddResponseBody(), addToCartString, RequestMethods.POST, json);
    }

}
