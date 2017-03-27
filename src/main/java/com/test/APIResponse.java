package com.test;

import java.util.Map;

/**
 * Created by Gregorio on 26/03/17.
 */
public class APIResponse {

    Integer statusCode;
    Map<String,Object> headers;
    String body;

    public APIResponse(Integer statusCode,Map<String,Object> headers,String body){
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String,Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String,Object> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
