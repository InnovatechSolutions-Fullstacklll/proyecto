package com.Inovatech.ms_proyectos.controller;

import com.Inovatech.ms_proyectos.dto.ProjectRequest;
import com.Inovatech.ms_proyectos.dto.ProjectResponse;
import com.Inovatech.ms_proyectos.entity.Project;
import com.Inovatech.ms_proyectos.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService service;

    @PostMapping
    public ProjectResponse createProject(
            @RequestBody ProjectRequest request) {

        return service.createProject(request);
    }

    @GetMapping
    public List<Project> getProjects() {
        return service.getProjects();
    }
}