package com.example.Mockito_01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	
	@Test
	public void testPerform() {
		
		Mockito.when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));
		
		Mockito.verify(service).add(2, 3);
	}
}
