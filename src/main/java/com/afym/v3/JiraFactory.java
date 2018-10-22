package com.afym.v3;

import com.afym.JiraActionable;
import com.afym.entity.Project;
import com.afym.v3.project.GetAllProjectsDeserialize;
import com.afym.v3.project.GetAllProjectsInvoke;

public class JiraFactory implements JiraActionable {

    private String endpoint;
    private String token;

    public JiraFactory(String endpoint, String token) {
        this.endpoint = endpoint;
        this.token = token;
    }

    public static JiraFactory getInstance(String endpoint, String token) {
        return new JiraFactory(endpoint, token);
    }

    @Override
    public Project[] getAllProjects() {
        GetAllProjectsInvoke invoke = new GetAllProjectsInvoke(this.endpoint, this.token);
        GetAllProjectsDeserialize deserialize = new GetAllProjectsDeserialize();
        return deserialize.run(invoke.getContent());
    }
}
