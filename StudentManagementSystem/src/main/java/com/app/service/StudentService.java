package com.app.service;

import java.util.List;

import com.app.Entity.Student;

public interface StudentService  {
	List<Student> getAllStudents();
      Student addStudent(Student stud);
}
