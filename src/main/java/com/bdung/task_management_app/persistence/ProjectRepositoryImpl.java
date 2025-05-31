package com.bdung.task_management_app.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.bdung.task_management_app.persistence.models.Project;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public Project save(Project project){
        Project existintgProject = findById(project.getId())
                .orElse(null);
        if (existintgProject == null) {
            projects.add(project);
            return project;
        } else {
            projects.remove(existintgProject);
            Project newProject = new Project(project);
            projects.add(newProject);
            return project;
        }
    }
}
