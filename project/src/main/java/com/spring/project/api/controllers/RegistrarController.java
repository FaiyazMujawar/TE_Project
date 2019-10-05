package com.spring.project.api.controllers;

import com.spring.project.api.classes.ParticipantDetails;
import com.spring.project.api.services.ParticipantService;
import com.spring.project.api.tables.Participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RegistrarController
 */
@RestController
@RequestMapping("/api/registrar")
public class RegistrarController {

    @Autowired
    private ParticipantService participantService;

    @PostMapping("/{eventId}/participants/add")
    public void addParticipant(@RequestBody ParticipantDetails participant, @PathVariable int eventId) {
        participantService.addParticipant(new Participant(participant.id, participant.fname, participant.mname, participant.lname, participant.email, participant.contact, eventId));
    }
}