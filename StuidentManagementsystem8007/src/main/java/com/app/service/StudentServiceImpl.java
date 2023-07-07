package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Student;
import com.app.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
private StudentRepository studRepo;

	 
	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		return studRepo.findAll();
	}

}
