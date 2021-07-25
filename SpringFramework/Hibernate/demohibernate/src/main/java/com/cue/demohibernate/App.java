package com.cue.demohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Department dept = new Department();
    	dept.setDeptId(10);
    	dept.setDeptName("Engineering");
    	
    	
    	Laptop lp1 = new Laptop();
    	lp1.setLid(101);
    	lp1.setLname("Hp");
    	
    	Laptop lp2 = new Laptop();
    	lp2.setLid(102);
    	lp2.setLname("Dell");

    	Laptop lp3 = new Laptop();
    	lp3.setLid(103);
    	lp3.setLname("Mac");
    	
    	
    	EmpName en = new EmpName();
    	en.setFname("Sohan");
    	en.setMname("Kiran");
    	en.setLname("Chougule");
    	
    	Employee emp = new Employee();
    	emp.setEmpid(1);
    	emp.setEmpname(en);
    	emp.setEmail("s@mail.com");
    	emp.setDept(dept);
    	emp.getLaptop().add(lp1);
    	emp.getLaptop().add(lp2);
    	
    	
    	EmpName en1 = new EmpName();
    	en1.setFname("Rohan");
    	en1.setMname("Skc");
    	en1.setLname("Choudhary");
    	
    	Employee emp1 = new Employee();
    	emp1.setEmpid(2);
    	emp1.setEmpname(en1);
    	emp1.setEmail("r@mail.com");
    	emp1.setDept(dept);
    	emp1.getLaptop().add(lp3);
    	
    	
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(lp1);
    	session.save(lp2);
    	session.save(lp3);
    	session.save(dept);
    	session.save(emp);
    	session.save(emp1);
    	
  //  	Employee emp = session.get(Employee.class, 2);
    	
    	
    	tx.commit();
    	
    	System.out.println(emp);
    	System.out.println(emp1);
    	System.out.println(dept);
    	
    }
}
