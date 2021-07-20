package com.example.bootjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.bootjpa.dao.EmployeeRepo;
import com.example.bootjpa.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam Integer eid) {
		ModelAndView mv = new ModelAndView("showEmployee.jsp");
		Employee employee = repo.findById(eid).orElse(new Employee());
		System.out.println(employee);
		
//		List list1 = repo.findByEidGreaterThan(eid);
//		System.out.println(list1);
//		
		
		mv.addObject(employee); 
		return mv;
	}
	
//	@RequestMapping("/getEmpdept")
//	public ModelAndView getEmpdept(@RequestParam String department) {
//		ModelAndView mv = new ModelAndView("home.jsp");
//		List list = repo.findByDepartment(department);
//		System.out.println(list);
//		
//		List list1 = repo.findByDepartmentSort(department);
//		System.out.println(list1);
//		
//		
//		
//		mv.addObject(list); 
//		return mv;
//	}
	
	
	@RequestMapping("/employees")
	@ResponseBody
	public Iterable<Employee> getEmployee() {
		return repo.findAll();
	}
	
	@RequestMapping("/employees/{eid}")
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable int eid) {
		return repo.findById(eid);
	}
	
	
	@PostMapping("/employees")
	@ResponseBody
	public Employee getEmployee3(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}
	
	
	@DeleteMapping("/employees/{eid}")
	@ResponseBody
	public Employee getEmployee4(@PathVariable("eid") int eid) {
		Employee emp = repo.getOne(eid);
		repo.delete(emp);
		return emp;
	}
	
	@PutMapping(path="/employees",consumes= {"application/json"})
	@ResponseBody
	public Employee getEmployee5(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}
	
}
