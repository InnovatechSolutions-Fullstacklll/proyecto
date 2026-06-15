package com.Inovatech.ms_proyectos.repository;

import com.Inovatech.ms_proyectos.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
