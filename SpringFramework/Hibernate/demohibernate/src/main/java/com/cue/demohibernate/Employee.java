package com.cue.demohibernate;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * @Entity : is used to define an entity
 * @Entity(name="employee_entity") here we can define the name of the 
 * entity by default it will uce the class name
 * 
 * @Table(name="emp_table") is used to change the table name
 * table name and entity name are different
 * 
 * @Id : is used to define the primary key
 * 
 * @Column(name="emp_email") is used to change name of the column
 * 
 * @Transient : Specifies that the property or field is not persistent
 * 
 */


@Entity
@Table(name="emp_table")
public class Employee {
	
	@Id
	private int empid;
//	@Transient
	private EmpName empname;
	@Column(name="emp_email")
	private String email;
	@OneToOne
	private Department dept;
	
	@OneToMany(mappedBy = "emp")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public EmpName getEmpname() {
		return empname;
	}
	public void setEmpname(EmpName empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", dept=" + dept + ", laptop="
				+ laptop + "]";
	}
	
	
}
