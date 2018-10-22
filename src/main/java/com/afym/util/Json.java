package com.afym.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Json {
    public static <T> T deserialize(String json, Class<T> clazz)
    {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.fromJson(json, clazz);
    }
}