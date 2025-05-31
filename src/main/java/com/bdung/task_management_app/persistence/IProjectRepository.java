package com.bdung.task_management_app.persistence;

import java.util.Optional;

import com.bdung.task_management_app.persistence.models.Project;

public interface IProjectRepository {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
