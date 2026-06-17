package com.Inovatech.ms_proyectos.controller;

import com.Inovatech.ms_proyectos.dto.ProjectRequest;
import com.Inovatech.ms_proyectos.dto.ProjectResponse;
import com.Inovatech.ms_proyectos.entity.Project;
import com.Inovatech.ms_proyectos.service.ProjectService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProjectControllerTest {

    @Test
    void createProjectTest() {

        ProjectService service =
                mock(ProjectService.class);

        ProjectController controller =
                new ProjectController(service);

        ProjectRequest request =
                ProjectRequest.builder()
                        .nombre("Proyecto")
                        .build();

        when(service.createProject(request))
                .thenReturn(
                        ProjectResponse.builder()
                                .nombre("Proyecto")
                                .build()
                );

        ProjectResponse response =
                controller.createProject(request);

        assertEquals(
                "Proyecto",
                response.getNombre()
        );
    }

    @Test
    void getProjectsTest() {

        ProjectService service =
                mock(ProjectService.class);

        ProjectController controller =
                new ProjectController(service);

        when(service.getProjects())
                .thenReturn(List.of());

        List<Project> result =
                controller.getProjects();

        assertNotNull(result);
    }
}