package com.app.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeService {
List <Employee> getAllEmployee();
Employee addEmployee(Employee emp);
String deleteById(Long id);
Employee updateEmployee(Employee emps);
Employee getEmployeeById(Long id);

}
