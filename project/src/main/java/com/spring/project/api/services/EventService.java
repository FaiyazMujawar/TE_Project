package com.spring.project.api.services;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.repositories.EventRepository;
import com.spring.project.api.tables.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EventService
 */
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEvent(int eventId) {
        return eventRepository.findById(eventId);
    }

    public void updateEvent(Event event) {
        eventRepository.save(event);
    }

    public void deleteEvent(int eventId) {
        eventRepository.deleteById(eventId);
    }
}