package com.spring.project.api.controllers;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.classes.UserDetails;
import com.spring.project.api.services.EventService;
import com.spring.project.api.services.UserService;
import com.spring.project.api.tables.Event;
import com.spring.project.api.tables.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AdminController: Controller for Admin
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    public UserService userService;

    @Autowired
    public EventService eventService;

/* EVENTS: */

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/events/{eventId}")
    public Optional<Event> getEvent(@PathVariable int eventId) {
        return eventService.getEvent(eventId);
    }

    @PutMapping("/events/{eventId}")
    public void updateEvent(@RequestBody Event event, @PathVariable int eventId) {
        event.id = eventId;
        eventService.updateEvent(event);
    }

    @PostMapping("/events/add")
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    // TODO : Implement public void deleteEvent(int eventId)

/* CO-ORDINATORS: */

    @PostMapping("/co-ordinators/add")
    public void addCoordinator(@RequestBody UserDetails newCo) {
        userService.addUser(new User(newCo.id,newCo.username,newCo.fname,newCo.mname,newCo.lname,newCo.email,newCo.password,newCo.cont,2,newCo.eventId));
    }

    @GetMapping("/co-ordinators")
    public List<User> getAllCoordiantors() {
        return userService.getAllUsers(2);
    }

    @GetMapping("/co-ordinators/{coId}")
    public Optional<User> getCoordinator(@PathVariable int coId) {
        return userService.getUser(2,coId);
    }

    @PutMapping("/co-ordinators/{coId}")
    public void updateCoordinator(@RequestBody UserDetails user, @PathVariable int coId) {
        user.id = coId;
        userService.updateUser(new User(user.id, user.username,user.fname,user.mname,user.lname,user.email,user.password,user.cont,2,user.eventId));
    }

    @DeleteMapping("/co-ordinators/{coId}")
    public void removeCoordinator(@PathVariable int coId) {
        userService.deleteUser(coId);
    }

/* REGISTRARS */

    @GetMapping("/registrars")
    public List<User> getAllRegistrars() {
        return userService.getAllUsers(3);          //Passing 3 because role_id for Registrar is 3
    }

    @GetMapping("/registrars/{userId}")
    public Optional<User> getUser(@PathVariable int userId) {
        return userService.getUser(3,userId);
    }
}