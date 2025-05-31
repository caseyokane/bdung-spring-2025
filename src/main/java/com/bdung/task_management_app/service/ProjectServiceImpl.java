package com.bdung.task_management_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bdung.task_management_app.persistence.IProjectRepository;
import com.bdung.task_management_app.persistence.models.Project;

public class ProjectServiceImpl  implements IProjectService {

    @Autowired
    private final IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

}
