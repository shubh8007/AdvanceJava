package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
