package com.Inovatech.ms_proyectos.service;

import com.Inovatech.ms_proyectos.dto.ProjectRequest;
import com.Inovatech.ms_proyectos.dto.ProjectResponse;
import com.Inovatech.ms_proyectos.entity.Project;
import com.Inovatech.ms_proyectos.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {

    @Mock
    private ProjectRepository repository;

    @InjectMocks
    private ProjectService service;

    @Test
    void createProjectTest() {

        ProjectRequest request =
                ProjectRequest.builder()
                        .nombre("Sistema Inventario")
                        .area("Backend")
                        .estado("Activo")
                        .tecnologia("Spring Boot")
                        .integrantes(
                                List.of("Camilo","Nicolas")
                        )
                        .build();

        when(repository.save(any()))
                .thenAnswer(i -> i.getArgument(0));

        ProjectResponse response =
                service.createProject(request);

        assertEquals(
                "Sistema Inventario",
                response.getNombre()
        );

        verify(repository).save(any());
    }

    @Test
    void getProjectsTest() {

        List<Project> projects = List.of(
                Project.builder()
                        .nombre("Proyecto 1")
                        .build()
        );

        when(repository.findAll())
                .thenReturn(projects);

        List<Project> result =
                service.getProjects();

        assertEquals(1, result.size());
    }
}