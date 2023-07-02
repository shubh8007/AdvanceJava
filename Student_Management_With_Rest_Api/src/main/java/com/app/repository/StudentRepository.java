package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Student;

@org.springframework.stereotype.Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
Optional<Student> findByEmailAndPassword(String em,String pas);
}
