package com.example.bootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByDepartment(String department);

	List<Employee> findByEidGreaterThan(Integer eid);
	
	@Query("from Employee where department=?1 order by ename")
	List<Employee> findByDepartmentSort(String department);
	
	
}
