package com.afym.v3.project;

import com.afym.GlobalInvoke;
import com.afym.util.HttpConnector;

public class GetAllProjectsInvoke extends GlobalInvoke {

    public GetAllProjectsInvoke(String endpoint, String token) {
        super(endpoint, token);
    }

    @Override
    public String getContent() {
        return HttpConnector.get(this.endpoint + "/rest/api/3/project", this.token);
    }
}
