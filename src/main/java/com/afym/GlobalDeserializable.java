package com.afym;

import com.afym.util.Json;

public class GlobalDeserializable<T> {
    protected Class<T> clazz;

    public T run(String content) {
        return Json.deserialize(content, clazz);
    }
}
