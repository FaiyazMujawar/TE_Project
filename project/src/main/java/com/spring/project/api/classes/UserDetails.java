package com.spring.project.api.classes;

/**
 * UserDetails
 */
public class UserDetails {

    public int id;
    public String username;
    public String fname;
    public String mname;
    public String lname;
    public String email;
    public String password;
    public long cont;
    public int eventId;

    public UserDetails(int id, String username, String fname, String mname, String lname, String email, String password,
            long cont, int eventId) {
        this.id = id;
        this.username = username;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.cont = cont;
        this.eventId = eventId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCont() {
        return cont;
    }

    public void setCont(long cont) {
        this.cont = cont;
    }
}