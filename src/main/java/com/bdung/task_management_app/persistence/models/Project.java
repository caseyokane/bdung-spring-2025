package com.bdung.task_management_app.persistence.models;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Project {

    private Long id;
    private String name;
    private LocalDate dateCreated;

    public Project(Project project) {
        this(project.getId(), project.getName(), project.getDateCreated());

    }

    public Project(Long id, String name, LocalDate dateCreated) {
        if(Objects.isNull(id)) {
            id = new Random().nextLong();
        }
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

}
