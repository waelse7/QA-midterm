package org.example.api.infra;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.example.api.entities.responses.WithStatus;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;


public class HttpFacade {
    public <T extends WithStatus> T httpRequest(T clz,
                                                String url,
                                                RequestMethods methods,
                                                String jsonBody,
                                                HashMap<String, String> params,
                                                HashMap<String, String> headers) throws IOException {
        if (params != null){
            StringBuilder urlBuilder = new StringBuilder(url);
            urlBuilder.append("?");
            for (String key: params.keySet()) {
                urlBuilder.append(key).append("=").append(params.get(key)).append("&");
            }
            url = urlBuilder.toString();
        }
        HttpUriRequest httpMethod = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()){
            CloseableHttpResponse response = null;
            switch (methods) {
                case POST -> {
                    if (jsonBody != null){
                        httpMethod = new HttpPost(url);
                        StringEntity json = new StringEntity(jsonBody);
                        httpMethod.setEntity(json);
                        httpMethod.setHeader("Accept", "application/json");
                        httpMethod.setHeader("Content-type", "application/json");
                        if (headers != null) {
                            for (HashMap.Entry<String, String> entry : headers.entrySet()) {
                                httpMethod.setHeader(entry.getKey(), entry.getValue());
                            }
                        }
                    }else {
                        httpMethod = new HttpPost(url);
                    }
                }
                case GET -> {
                    httpMethod = new HttpGet(url);
                }
                case DELETE -> {
                    httpMethod = new HttpDelete(url);
                }
                case PATCH -> {
                    if (jsonBody != null){
                        httpMethod = new HttpPatch(url);
                        StringEntity json = new StringEntity(jsonBody);
                        httpMethod.setEntity(json);
                        httpMethod.setHeader("Accept", "application/json");
                        httpMethod.setHeader("Content-type", "application/json");
                        if (headers != null) {
                            for (HashMap.Entry<String, String> entry : headers.entrySet()) {
                                httpMethod.setHeader(entry.getKey(), entry.getValue());
                            }
                        }
                    }else {
                        httpMethod = new HttpPatch(url);
                    }
                }
            }
            response = httpClient.execute(httpMethod);
            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);
            int statusCode = response.getCode();
            ObjectMapper objectMapper = new ObjectMapper();
            clz = objectMapper.readValue(responseBody, (Class<T>) clz.getClass());
            clz.getClass().getMethod("setStatusCode", int.class).invoke(clz, statusCode);

        } catch (ParseException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return clz;
    }

    public <T extends WithStatus> T httpRequest(T clz, String url, RequestMethods methods, HashMap<String, String> params, HashMap<String, String> headers) throws IOException {
        return httpRequest(clz, url, methods, null, params, headers);
    }
    public <T extends WithStatus> T httpRequest(T clz, String url, RequestMethods methods, HashMap<String, String> headers) throws IOException {
        return httpRequest(clz, url, methods, null, null, headers);
    }
    public <T extends WithStatus> T httpRequest(T clz, String url, RequestMethods methods, String jsonBody) throws IOException {
        return httpRequest(clz, url, methods, jsonBody, null);
    }
    public <T extends WithStatus> T httpRequest(T clz, String url, RequestMethods methods, String jsonBody, HashMap<String, String> headers) throws IOException {
        return httpRequest(clz, url, methods, jsonBody, null, headers);
    }
}

