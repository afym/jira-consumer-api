package com.afym.util;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HttpConnector {
    public static String get(String endpoint, String token) {
        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get(endpoint)
                    .header("Accept", "application/json")
                    .header("Bearer", token)
                    .asJson();
            return response.getBody().toString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return "";
    }
}
