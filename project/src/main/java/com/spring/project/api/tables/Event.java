package com.spring.project.api.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Event
 */
@Entity
public class Event {

    @Id
    @Column(name = "event_id")
    public int event_id;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    public Event(int event_id, String name, String description) {
        this.event_id = event_id;
        this.name = name;
        this.description = description;
    }

    public Event()
    {}
    
    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
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