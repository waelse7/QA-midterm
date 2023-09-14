package org.example.api.logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.api.entities.requests.AddRequestBody;
import org.example.api.entities.responses.LoginResponse.AddToCartResponse.AddResponseBody;
import org.example.api.infra.HttpFacade;
import org.example.api.infra.RequestMethods;

public class ApiRequests {
    private String logInString = "https://api-prod.rami-levy.co.il/api/v2/site/auth/login";
    private String searchString = "https://www.rami-levy.co.il/api/catalog?";
    private static String addToCartString = "https://www.rami-levy.co.il/api/v2/cart";

    private static HttpFacade facade = new HttpFacade();

    public static AddResponseBody addToCart(AddRequestBody addRequestBody) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(addRequestBody);
        return facade.httpRequest(new AddResponseBody(), addToCartString, RequestMethods.POST, json);
    }
}
