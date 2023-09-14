package org.example.api.infra;

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
import org.example.api.entities.responses.WithStatus;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class HttpFacade {
    public <T extends WithStatus> T httpRequest(T clz, String url, RequestMethods methods, String jsonBody) throws IOException {
<<<<<<< HEAD

=======
>>>>>>> 8110b7d4cc42697b1765b540e100c0bf551ed5ca
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
            int statusCode = response.getCode();
            ObjectMapper objectMapper = new ObjectMapper();
            clz = objectMapper.readValue(responseBody, (Class<T>) clz.getClass());
            clz.getClass().getMethod("setStatusCode", int.class).invoke(clz, statusCode);

        } catch (ParseException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        return clz;
    }
    public <T extends WithStatus> T httpRequest( T clz, String url, RequestMethods methods) throws IOException {
        return httpRequest(clz, url, methods, null);
    }
<<<<<<< HEAD

=======
>>>>>>> 8110b7d4cc42697b1765b540e100c0bf551ed5ca
}

