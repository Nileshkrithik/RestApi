package com.Nilesh.restapi.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nilesh.restapi.day3.model.Employee;

@Repository

public interface EmpRepo extends JpaRepository<Employee,Integer> {
		
	}

