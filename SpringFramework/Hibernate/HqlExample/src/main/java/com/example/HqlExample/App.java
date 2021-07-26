package com.example.HqlExample;


import java.util.List;
import java.util.Map;



import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session1 = sf.openSession();
    	session1.beginTransaction();

    	
//	for adding 50 students in database
    	
//    	Random r = new Random(); 
//    	
//    	for (int i = 1; i <= 50; i++) {
//			Student s = new Student();
//			s.setRollno(i);
//			s.setName("Name"+i);
//			s.setMarks(r.nextInt(100));
//			session1.save(s);
//		}
//    	
    
    	
    	// To print all students
    	
//    	Query q = session1.createQuery("from Student");
//    	List<Student> students = q.list();
//    	for (Student student : students) {
//			System.out.println(student);
//		}
//    	
    	// adding where clause
    	
//    	Query q = session1.createQuery("from Student where marks > 50");
//    	List<Student> students = q.list();
//    	for (Student student : students) {
//			System.out.println(student);
//		}
//    	
    	// only one result
    	
//    	Query q = session1.createQuery("from Student where rollno = 7");
//    	Student student = (Student) q.uniqueResult();
//    	System.out.println(student);
//		
    	// printing for columns values of each column is different data type so use Object 
    	
//    	Query q = session1.createQuery("select rollno,name,marks from Student where rollno = 7");
//    	Object[] student = (Object[]) q.uniqueResult();
//    	
//    	System.out.println(student[0] + " : " + student[1] + " : " + student[2]);
//		
    	
    	// for entire table values
//    	Query q = session1.createQuery("select rollno,name,marks from Student");
//    	List<Object[]> students = (List<Object[]>) q.list();
//    	for (Object[] student : students) {
//    		System.out.println(student[0] + " : " + student[1] + " : " + student[2]);
//		}
    	
    	// added where clause
    	
//    	Query q = session1.createQuery("select rollno,name,marks from Student s where s.marks >60");
//    	List<Object[]> students = (List<Object[]>) q.list();
//    	for (Object[] student : students) {
//    		System.out.println(student[0] + " : " + student[1] + " : " + student[2]);
//		}
//    	
    	
    	// aggregate function sum()
    	
//    	Query q = session1.createQuery("select sum(marks) from Student s where s.marks >60");
//    	Object marks = (Object) q.uniqueResult();
//    	System.out.println(marks);
//    	
    	int b = 60;
    	
    	//Query q = session1.createQuery("select sum(marks) from Student s where s.marks >"+b);
    	
    	//to avoid concatenation
//    	Query q = session1.createQuery("select sum(marks) from Student s where s.marks > :b");
//    	q.setParameter("b", b);
//    	Object marks = (Object) q.uniqueResult();
//    	System.out.println(marks);
    	
    	// ####################################################
    	// SQL in hibernate
    	
    	
    	//Native Query
//    	SQLQuery query = session1.createSQLQuery("select * from student where marks > 60");
//    	query.addEntity(Student.class);
//    	List<Student> students = query.list();
//    	for (Student object : students) {
//			System.out.println(object);
//		}
    	
//    	SQLQuery query = session1.createSQLQuery("select name,marks from student where marks > 60");
//    	query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//    	List students = query.list();
//    	for (Object object : students) {
//			Map m = (Map) object;
//    		System.out.println(m.get("name") + " : " + m.get("marks"));
//		}
//    	
    	
//    	Query query=session1.createQuery("from Student");  
//    	query.setFirstResult(5);  
//    	query.setMaxResults(10);  
//    	List list=query.list();//will return the records from 5 to 10th number  
//    	 for (Object object : list) {
//			System.out.println(object);
//		}
//    	
    	
    	
//    	Query q=session1.createQuery("update Student set name=:n where rollno=:i");  
//    	q.setParameter("n","Sohan");  
//    	q.setParameter("i",7);  
//    	  
//    	int status=q.executeUpdate();  
//    	System.out.println(status);  
//    	
    	
//    	Query query=session1.createQuery("delete from Student where id=10");  
//    	query.executeUpdate();
//    	
    	
//    	Query q=session1.createQuery("select sum(marks) from Student");  
//    	Long summarks =(Long) q.uniqueResult();  
//    	System.out.println(summarks); 
//    	
    	
//    	Query q=session1.createQuery("select max(marks) from Student");  
//    	Object marks = q.uniqueResult();  
//    	System.out.println(marks);
    	
//    	Query q=session1.createQuery("select min(marks) from Student");  
//    	Object marks = q.uniqueResult();  
//    	System.out.println(marks);
    	
//    	Query q=session1.createQuery("select count(rollno) from Student");  
//    	Object cnt = q.uniqueResult();  
//    	System.out.println(cnt);
//    	
    	Query q=session1.createQuery("select avg(marks) from Student");  
    	Object marks = q.uniqueResult();  
    	System.out.println(marks);
    	
    	
    	session1.getTransaction().commit();
    	
    	 
    }
}
