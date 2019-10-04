package com.spring.project.api.services;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.repositories.ParticipantRepository;
import com.spring.project.api.tables.Participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ParticipantService
 */
@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }

    public List<Participant> getAllParticipantsOnEvent(int eventId) {
        return participantRepository.findByEventId(eventId);
    }

    public Optional<Participant> getParticipant(int id) {
        return participantRepository.findById(id);
    }

    public void addParticipant(Participant participant) {
        participantRepository.save(participant);
    }

    public void updateParticipant(Participant participant) {
        participantRepository.save(participant);
    }

    public void removeParticipant(int id) {
        participantRepository.deleteById(id);
    }
} 