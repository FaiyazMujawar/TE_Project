package com.spring.project.api.repositories;

import com.spring.project.api.tables.Event;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EventRepository
 */
public interface EventRepository extends JpaRepository<Event,Integer>{

    
}