package com.afym.test.v3.project;

import com.afym.test.BaseTest;
import com.afym.v3.JiraFactory;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

public class GetAllProjectsActionTest extends BaseTest {
    @Rule
    public WireMockRule service1 = new WireMockRule(2345);
    private String successResponse;

    @Before
    public void setContent() throws IOException, URISyntaxException {
        this.successResponse = this.getContent("v3/project/get-all-projects.json");
    }

    @Test
    public void validateCorrectAction(){
        service1.stubFor(get(urlEqualTo("/rest/api/3/project"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json;charset=UTF-8")
                        .withHeader("Bearer", "token")
                        .withBody(this.successResponse)));

        JiraFactory jiraFactory = JiraFactory.getInstance("http://localhost:2345", "token");
        AssertProjectDeserialize.testGetAllProjectsEntity(jiraFactory.getAllProjects());
    }
}