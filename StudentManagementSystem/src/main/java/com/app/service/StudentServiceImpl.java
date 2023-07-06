package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.Entity.Student;
import com.app.Repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studRepo;

	public StudentServiceImpl() {
		System.out.println("in Student Serviceimpl class........");
	}

     @Override
	public List<Student> getAllStudents() {
		System.out.println("in get student method...of studserviceimpl");
		return studRepo.findAll();
	}

	@Override
	public Student addStudent(Student stud) {
		
		return studRepo.save(stud);
	}

}
