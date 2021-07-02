package com.maven.ProjectName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	@Autowired
	private Seat seat;
	
	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}



	public void drive() {
		System.out.println("Driving Bike");
		System.out.println("Seat "+ seat );
	}
}
