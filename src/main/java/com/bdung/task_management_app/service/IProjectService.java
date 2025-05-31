package com.bdung.task_management_app.service;

import java.util.Optional;

import com.bdung.task_management_app.persistence.models.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
