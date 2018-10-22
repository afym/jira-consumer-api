package com.afym;

abstract public class GlobalInvoke {
    protected String endpoint;
    protected String token;

    public GlobalInvoke(String endpoint, String token)
    {
        this.endpoint = endpoint;
        this.token = token;
    }

    abstract public String getContent();
}
