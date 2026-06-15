package com.Inovatech.ms_proyectos.service;

import com.Inovatech.ms_proyectos.dto.ProjectRequest;
import com.Inovatech.ms_proyectos.dto.ProjectResponse;
import com.Inovatech.ms_proyectos.entity.Project;
import com.Inovatech.ms_proyectos.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectResponse createProject(
            ProjectRequest request) {

        Project project = Project.builder()
                .nombre(request.getNombre())
                .tecnologia(request.getTecnologia())
                .integrantes(request.getIntegrantes())
                .build();

        repository.save(project);

        return ProjectResponse.builder()
                .id(project.getId())
                .nombre(project.getNombre())
                .tecnologia(project.getTecnologia())
                .integrantes(project.getIntegrantes())
                .build();
    }

    public List<Project> getProjects() {
        return repository.findAll();
    }
}
