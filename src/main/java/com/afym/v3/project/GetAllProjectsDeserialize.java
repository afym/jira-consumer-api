package com.afym.v3.project;

import com.afym.GlobalDeserializable;
import com.afym.entity.Project;

public class GetAllProjectsDeserialize extends GlobalDeserializable<Project[]> {
    public GetAllProjectsDeserialize() {
        this.clazz = Project[].class;
    }
}
