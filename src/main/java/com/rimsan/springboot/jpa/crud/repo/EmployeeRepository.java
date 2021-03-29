package com.rimsan.springboot.jpa.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rimsan.springboot.jpa.crud.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   
	
}
