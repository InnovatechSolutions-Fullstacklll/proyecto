package com.Inovatech.ms_proyectos.dto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectDtoTest {

    @Test
    void requestTest() {

        ProjectRequest request =
                ProjectRequest.builder()
                        .nombre("Proyecto")
                        .area("Frontend")
                        .estado("Planificacion")
                        .tecnologia("React")
                        .integrantes(List.of("Camilo"))
                        .build();

        assertEquals(
                "Frontend",
                request.getArea()
        );
    }

    @Test
    void responseTest() {

        ProjectResponse response =
                ProjectResponse.builder()
                        .id(1L)
                        .nombre("Proyecto")
                        .area("Backend")
                        .estado("Activo")
                        .build();

        assertEquals(
                "Activo",
                response.getEstado()
        );
    }
}