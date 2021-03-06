package com.spring.project.api.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id")
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    public Role(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Role() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}