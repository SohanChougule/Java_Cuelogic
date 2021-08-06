package com.example.Mockito_01;

public class Calculator {
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}

	public int perform(int i, int j) {
		return service.add(i,j)*2;
		//return (i+j)*2;
	}
}
