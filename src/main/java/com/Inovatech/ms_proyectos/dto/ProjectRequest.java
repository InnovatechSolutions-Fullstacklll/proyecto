package com.Inovatech.ms_proyectos.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectRequest {

    private String nombre;
    private String area;
    private String estado;
    private String tecnologia;
    private List<String> integrantes;
}
