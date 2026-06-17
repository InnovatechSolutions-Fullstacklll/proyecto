package com.Inovatech.ms_proyectos.entity;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void projectBuilderTest() {

        Project project =
                Project.builder()
                        .id(1L)
                        .nombre("Proyecto")
                        .area("Backend")
                        .estado("Activo")
                        .tecnologia("Spring")
                        .integrantes(
                                List.of("Camilo")
                        )
                        .build();

        assertEquals(
                "Backend",
                project.getArea()
        );

        assertEquals(
                "Activo",
                project.getEstado()
        );
    }
}