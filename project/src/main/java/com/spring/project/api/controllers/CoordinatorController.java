package com.spring.project.api.controllers;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.classes.ParticipantDetails;
import com.spring.project.api.classes.UserDetails;
import com.spring.project.api.services.ParticipantService;
import com.spring.project.api.services.UserService;
import com.spring.project.api.tables.Participant;
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
 * CoordinatorController
 */
@RestController
@RequestMapping("/api/co-ordinator")
public class CoordinatorController {

    @Autowired
    private UserService userService;

    @Autowired
    private ParticipantService participantService;

    /* REGISTRARS */

    /* @GetMapping("/{eventId}/registrars")
    public List<User> getAllRegistrars(@PathVariable int eventId) {
        return userService.getAllUsersOnEvent(3, eventId);
    } */

    @GetMapping("/{eventId}/registrars/{userId}")
    public Optional<User> getRegistrar(@PathVariable int userId) {
        return userService.getUser(3,userId);
    }

    @PostMapping("/{eventId}/registrars/add")
    public void addRegistrar(@RequestBody UserDetails newReg,@PathVariable int eventId) {
        newReg.eventId = eventId;
        userService.addUser(new User(newReg.id,newReg.username,newReg.fname,newReg.mname,newReg.lname,newReg.email,newReg.password,newReg.cont,3,newReg.eventId));
    }
    
    @PutMapping("/{eventId}/registrars/{id}")
    public void updateRegistrar(@RequestBody UserDetails user, @PathVariable int id,@PathVariable int eventId) {
        user.id = id;
        user.eventId = eventId;
        userService.updateUser(new User(user.id, user.username,user.fname,user.mname,user.lname,user.email,user.password,user.cont,3,user.eventId));
    }

    @DeleteMapping("/{eventId}/registrars/{userId}")
    public void removeRegistrar(@PathVariable int userId) {
        userService.deleteUser(userId);
    }

    /* PARTICIPANTS */

    @PostMapping("/{eventId}/participants/add")
    public void addParticipant(@RequestBody ParticipantDetails participant,@PathVariable int eventId) {
        participantService.addParticipant(new Participant(participant.id, participant.fname, participant.mname, participant.lname, participant.email, participant.contact, eventId));
    }

    @GetMapping("/{eventId}/participants")
    public List<Participant> getAllParticipants(@PathVariable int eventId) {
        return participantService.getAllParticipantsOnEvent(eventId);
    }

    @GetMapping("/{eventId}/participants/{id}")
    public Optional<Participant> getParticipant(@PathVariable int id) {
        return participantService.getParticipant(id);
    }

    @PutMapping("/{eventId}/participants/{id}")
    public void updateParticipant(@RequestBody Participant participant,@PathVariable int id) {
        participant.id = id;
        participantService.updateParticipant(participant);
    }

    @DeleteMapping("/{eventId}/participants/{id}")
    public void removeParticipant(@PathVariable int id) {
        participantService.removeParticipant(id);
    }
}