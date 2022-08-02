package com.training.ofss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {

	Calculator calculator;
	int expected;
	int actual;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE ALL THE TESTS");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER ALL THE TESTS");
	}
	@BeforeEach
	void setUp1() throws Exception {
		System.out.println("BEFORE THE TEST1");
		calculator = new Calculator();
		expected = 20;
	}
	@BeforeEach
	void setUp2() throws Exception {
		System.out.println("BEFORE THE TEST2");
		
	}
	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		expected = 0;
		actual =0;
		System.out.println("AFTER THE TEST - Making NULL and all the values are 0 now");

	}
	@Test
	void testAdd1() {
		System.out.println("ACTUAL TEST - TEST ADD1");
		actual = calculator.add(13, 7);
		assertEquals(expected, actual);
	}
	@Test
	void testAdd2() {
		System.out.println("ACTUAL TEST - TEST ADD2");
		actual = calculator.add(10, 10);
		assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName(value = "testing convert to number if the input is \"20\"")
	void testConvertToNumber1() {
		actual = calculator.convertToNumber("20");
		assertEquals(expected, actual);
	}
	// Testing exception
	@Test
	@DisplayName(value = "testing convert to number if the input is \"Twenty\"")
	void testConvertToNumber2() {
		assertThrows(NumberFormatException.class, () -> {
			actual = calculator.convertToNumber("Twenty");
			assertEquals(expected, actual);
		});
		
	}
}
























