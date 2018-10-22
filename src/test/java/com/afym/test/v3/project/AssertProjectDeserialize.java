package com.afym.test.v3.project;

import com.afym.entity.Project;

import static org.junit.Assert.assertEquals;

public class AssertProjectDeserialize {

    public static void testGetAllProjectsEntity(Project[] projects)
    {
        assertEquals("scrum-project", projects[0].getName());
        assertEquals("kanban-project", projects[1].getName());
        assertEquals("10000", projects[0].getId());
        assertEquals("10001", projects[1].getId());
        assertEquals("AP", projects[0].getKey());
        assertEquals("KP", projects[1].getKey());
    }
}
