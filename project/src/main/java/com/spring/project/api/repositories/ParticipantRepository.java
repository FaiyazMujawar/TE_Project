package com.spring.project.api.repositories;

import java.util.List;

import com.spring.project.api.tables.Participant;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ParticipantRepository
 */
public interface ParticipantRepository extends JpaRepository<Participant,Integer>{

    public List<Participant> findByeventsId(int eventId);
}