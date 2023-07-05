package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.ResourceNotFoundException;
import com.app.Repository.EmployeeRepository;
import com.app.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
private EmployeeRepository empoRepo;
	@Override
	public List<Employee> getAllEmployee() {
System.out.println("In get Employee repo");
		return empoRepo.findAll();
	}
	@Override
	public Employee addEmployee(Employee emp) {
	System.out.println("In add employee repo");
		return empoRepo.save(emp);
	}
	@Override
	public String deleteById(Long id) {
		String msg="Employee deleted sucessfully";
		if(empoRepo.existsById(id)
				) {
			empoRepo.deleteById(id);
			System.out.println("Deleted by id"+id );
			
		}
		return msg;
	}
	@Override
	public Employee updateEmployee(Employee emps) {
		System.out.println("update Employee in esrvice");
		return empoRepo.save(emps);
	}
	@Override
	public Employee getEmployeeById(Long id) {
	System.out.println("In get by id method");
		return empoRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Enter valid Employee id"));
	}

}
