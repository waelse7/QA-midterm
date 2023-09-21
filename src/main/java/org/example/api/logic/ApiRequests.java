package org.example.api.logic;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.requests.LoginRequestBody;
import org.example.api.entities.requests.SearchRequestBody;

import org.example.api.infra.HttpFacade;
import org.example.api.infra.RequestMethods;

import java.io.IOException;

public class ApiRequests {
    private String logInString = "https://api-prod.rami-levy.co.il/api/v2/site/auth/login";
    private String searchString = "https://www.rami-levy.co.il/api/catalog?";
    private static String addToCartString = "https://www.rami-levy.co.il/api/v2/cart";

    private static HttpFacade facade = new HttpFacade();

    public static JsonNode addToCart(AddRequestBody addRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(addRequestBody);
        return facade.httpRequest(addToCartString, RequestMethods.POST, json);
    }
    public static JsonNode addToCart(LoginRequestBody loginRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(loginRequestBody);
        return facade.httpRequest(addToCartString, RequestMethods.POST, json);
    }
    public static JsonNode addToCart(SearchRequestBody searchRequestBody) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(searchRequestBody);
        return facade.httpRequest(addToCartString, RequestMethods.POST, json);
    }
}
