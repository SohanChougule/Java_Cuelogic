package com.example.bootDataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.bootDataRest.model.Employee;


@RepositoryRestResource(collectionResourceRel="employees",path="employees")
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
		
	
}
