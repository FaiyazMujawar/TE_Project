package com.spring.project.api.tables;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Participant
 */
@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @Column(name = "participant_id")
    public int id;

    @Column(name = "first_name")
    @NotNull
    public String fname;

    @Column(name = "mid_name")
    @NotNull
    public String mname;

    @Column(name = "last_name")
    @NotNull
    public String lname;

    @Column(name = "email")
    @NotNull
    public String email;
    
    @Column(name = "mobile")
    @NotNull
    public long contact;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "participant_event",
        joinColumns = @JoinColumn(name = "p_id"),
        inverseJoinColumns = @JoinColumn(name = "e_id")
    )
    public Set<Event> events = new HashSet<>();

    public Participant(int id, @NotNull String fname, @NotNull String mname, @NotNull String lname,
            @NotNull String email, @NotNull long contact, int eventId) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.events.add(new Event(eventId, "", ""));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    
    
}