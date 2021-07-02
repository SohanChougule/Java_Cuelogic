package com.example.SpringBootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Customer {
	private int cid;
	private String cname;
	private String address;
	
	@Autowired
	private Order order;
	
	// we are telling customer to search for order class object
	// from spring container and for that you need to use @Component
	// before Order class and @Autowired before creating the object reference
	
	// this will search by type but what if you want to search by name
	// from the spring container
	// by default in the container name of the class is in lower case
	// and name of the java file
	// if you want to change it we can use @Component("Write_Any_Name")
	// and after @Autowired use @Qualifier("Write_Any_Name")
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


	Customer(){
		System.out.println("Object created");
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("In show from Customer");
		order.orderplace();
	}
}
