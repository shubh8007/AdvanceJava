package com.app.service;

import java.util.List;

import com.app.dto.ApiRequestDto;
import com.app.dto.ApiRespDto;
import com.app.entities.Student;

public interface StudentService {
	List<Student> getStudentDetails();
	Student addStudentDetails(Student stud);
    Student getStudentById(Long sid);
    Student updateStudent(Student updateStud);
    String deleteStudent(Long sid);
    ApiRespDto authenticateStudent(ApiRequestDto req);
}
