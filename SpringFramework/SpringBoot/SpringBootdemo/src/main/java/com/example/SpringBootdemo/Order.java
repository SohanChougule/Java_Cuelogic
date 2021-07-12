package com.example.SpringBootdemo;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int Oid;
	private String product;
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public void orderplace() {
		System.out.println("Placing order");
	}
}
