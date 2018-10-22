package com.afym.test.v3.project;

import com.afym.test.BaseTest;
import com.afym.v3.project.GetAllProjectsDeserialize;
import com.afym.entity.Project;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.net.URISyntaxException;

public class GetAllProjectsDeserializeTest extends BaseTest {
    private String successResponse;

    @Before
    public void setContent() throws IOException, URISyntaxException {
        this.successResponse = this.getContent("v3/project/get-all-projects.json");
    }

    @Test
    public void validateCorrectDeserialize() {
        GetAllProjectsDeserialize deserialize = new GetAllProjectsDeserialize();
        Project[] projects = deserialize.run(this.successResponse);
        AssertProjectDeserialize.testGetAllProjectsEntity(projects);
    }
}
