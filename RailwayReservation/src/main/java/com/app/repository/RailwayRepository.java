package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entitites.Railway;
@Repository
public interface RailwayRepository  extends JpaRepository<Railway, Long>{
}
