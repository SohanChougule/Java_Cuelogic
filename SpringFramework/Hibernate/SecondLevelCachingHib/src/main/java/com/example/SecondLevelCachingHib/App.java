package com.example.SecondLevelCachingHib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee emp = null;
//    	Employee emp1 = new Employee();
//    	emp1.setEid(2);
//    	emp1.setEname("Sohan");
//    	Employee emp2 = new Employee();
//    	emp2.setEid(1);
//    	emp2.setEname("Rohan");
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session1 = sf.openSession();
    	Transaction tx = session1.beginTransaction();
    	
    	Query q1 = session1.createQuery("from Employee where eid=2");
    	q1.setCacheable(true);
    	emp = (Employee) q1.uniqueResult();
    	System.out.println(emp);
    	System.out.println("=======");
//    	session1.save(emp1);
//    	session1.save(emp2);
//    	
    	emp = session1.get(Employee.class, 1);
    	System.out.println(emp);
    	System.out.println("=======");
    	tx.commit();
    	session1.close();
    	
    	System.out.println("##############");
    	System.out.println("session1 closed and session2 begin");
    	System.out.println("##############");Session session2 = sf.openSession();
    	session2.beginTransaction();
    	
    	emp = session2.get(Employee.class, 1);
    	System.out.println(emp);
    	System.out.println("=======");
    	
    	
    	Query q2 = session2.createQuery("from Employee where eid=2");
    	q2.setCacheable(true);
    	emp = (Employee) q2.uniqueResult();
    	System.out.println(emp);
    	System.out.println("=======");
    	
    	session2.getTransaction().commit();
    	session2.close();
    }
}
