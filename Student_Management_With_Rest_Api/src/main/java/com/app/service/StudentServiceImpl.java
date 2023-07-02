package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customException.StudentException;
import com.app.dto.ApiRequestDto;
import com.app.dto.ApiRespDto;
import com.app.entities.Student;
import com.app.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
private StudentRepository studRepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Student> getStudentDetails() {
	System.out.println("In get student list...");
		return studRepo.findAll();
	}

	@Override
	public Student addStudentDetails(Student stud) {
		// TODO Auto-generated method stub
		return studRepo.save(stud);
	}

	@Override
	public Student getStudentById(Long sid) {
		System.out.println("In get student b y id method");
		return studRepo.findById(sid).orElseThrow(()->new StudentException("Entered Id is invalid"));
	}

	@Override
	public Student updateStudent(Student updateStud) {
		System.out.println("in update Student method");
		return studRepo.save(updateStud);
	}

	@Override
	public String deleteStudent(Long sid) {
		String msg="enter valid empid";
		if(studRepo.existsById(sid)) {
		  studRepo.deleteById(sid);
		  System.out.println("in delete Student");
		}
		
		return msg;
	}

	@Override
	public ApiRespDto authenticateStudent(ApiRequestDto req) {
		Student student=studRepo.findByEmailAndPassword(req.getEmail(), req.getPassword()).
				orElseThrow(()->new StudentException("you have Entered wrong email and password"));
		ApiRespDto authrespDto=mapper.map(student, ApiRespDto.class);
		return authrespDto;
	}

}
