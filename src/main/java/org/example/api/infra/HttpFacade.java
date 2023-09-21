package org.example.api.infra;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;


import java.io.IOException;



public class HttpFacade {
    public JsonNode httpRequest(String url, RequestMethods methods, String jsonBody) throws IOException {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()){
            CloseableHttpResponse response = null;
            switch (methods) {
                case POST -> {
                    if (jsonBody != null){
                        HttpPost httpMethod = new HttpPost(url);
                        StringEntity json = new StringEntity(jsonBody);
                        httpMethod.setEntity(json);
                        httpMethod.setHeader("Accept", "application/json");
                        httpMethod.setHeader("Content-type", "application/json");
                        response = httpClient.execute(httpMethod);
                    }else {
                        HttpPost httpMethod = new HttpPost(url);
                        response = httpClient.execute(httpMethod);
                    }
                }
                case GET -> {
                    HttpGet httpMethod = new HttpGet(url);
                    response = httpClient.execute(httpMethod);
                }
                case DELETE -> {
                    HttpDelete httpMethod = new HttpDelete(url);
                    response = httpClient.execute(httpMethod);
                }
                case PATCH -> {
                    if (jsonBody != null){
                        HttpPatch httpMethod = new HttpPatch(url);
                        StringEntity json = new StringEntity(jsonBody);
                        httpMethod.setEntity(json);
                        httpMethod.setHeader("Accept", "application/json");
                        httpMethod.setHeader("Content-type", "application/json");
                        response = httpClient.execute(httpMethod);
                    }else {
                        HttpPatch httpMethod = new HttpPatch(url);
                        response = httpClient.execute(httpMethod);
                    }
                }
            }
            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(responseBody);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public JsonNode httpRequest(String url, RequestMethods methods) throws IOException {
        return httpRequest(url, methods, null);
    }

}

