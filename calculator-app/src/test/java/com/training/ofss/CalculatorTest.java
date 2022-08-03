package com.training.ofss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class )
 class CalculatorTest
{
	
	Calculator calculator = new Calculator();

	@Test
	@Order(1)
	@DisplayName(value = "2.Adding two whole numbers that are equal")
	void testAdd() {
		int expected=20;
		int actual = calculator.add(10, 10);
		assertEquals(expected, actual);
	}

	
	@Test
	@Order(2)
	@DisplayName(value = "3.Adding two whole numbers that are not equal")
	void testAdd2() {
		int expected=20;
		int actual = calculator.add(13, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value = "1.Adding one whole number and one negative number that are not equal")
	@Order(3)
	void testAdd3() {
		int expected=20;
		int actual = calculator.add(40, -20);
		assertEquals(expected, actual);
	}
	

}
