package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entitites.Passaenger;

public interface PassengerRepository extends JpaRepository<Passaenger, Long> {

}
