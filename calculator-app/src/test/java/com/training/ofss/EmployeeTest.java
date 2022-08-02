package com.training.ofss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.opentest4j.AssertionFailedError;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class EmployeeTest {
	
	Employee emp;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before the test");
		emp = new Employee();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		emp = null;
		System.out.println("Making everything null");
		
	}

	@Test
	@Order(9)
	@DisplayName(value = "Setting position as tester")
	void testSetPosition() {
		String expected ="tester";
		emp.setPosition(expected);
		String actual = emp.getPosition();
		assertEquals(expected,actual);
	}
	
	@Test
	@Order(3)
	@DisplayName(value = "Setting position any element other than array provided")
	void testSetPosition1() {
		String expected ="testre";
		assertThrows(AssertionFailedError.class, () -> {
		emp.setPosition(expected);
		String actual = emp.getPosition();
		assertEquals(expected,actual);
		});
	}
	@Test
	@Order(8)
	@DisplayName(value = "Setting number within range")
	void testSetNumber() {
		int expected = 100;
		emp.setNumber(expected);
		int actual = emp.getNumber();
		assertEquals(expected,actual);
	}
//	
	@Test
	@Order(6)
	@DisplayName(value = "Setting number beyond range")
	void testSetNumber2() {
		int expected = 10000;
		assertThrows(AssertionFailedError.class, () -> {
		emp.setNumber(expected);
		int actual = emp.getNumber();
		assertEquals(expected,actual);
			
		});
	
	}
	@Test
	@Order(2)
	@DisplayName(value = "Setting negative number")
	void testSetNumber3() {
		int expected = -100;
		assertThrows(AssertionFailedError.class, () -> {
		emp.setNumber(expected);
		int actual = emp.getNumber();
		assertEquals(expected,actual);
			
		});
	
	}

	@Test
	@Order(7)
	@DisplayName(value = "Setting age within range")
	void testSetAge() {
		int expected = 50;
		emp.setAge(expected);
		int actual = emp.getAge();
		assertEquals(expected,actual);
		
	}
	
	@Test
	@Order(5)
	@DisplayName(value = "Setting age beyond range")
	void testSetAge2() {
		int expected = 18;
		assertThrows(AssertionFailedError.class, () -> {
		emp.setAge(expected);
		int actual = emp.getAge();
		assertEquals(expected,actual);
			
		});
	}
	@Test
	@Order(4)
	@DisplayName(value = "Setting age beyond range")
	void testSetAge3() {
		int expected = 85;
		assertThrows(AssertionFailedError.class, () -> {
		emp.setAge(expected);
		int actual = emp.getAge();
		assertEquals(expected,actual);
			
		});
	}
	@Test
	@Order(1)
	@DisplayName(value = "Setting age negative")
	void testSetAge4() {
		int expected = -20;
		assertThrows(AssertionFailedError.class, () -> {
		emp.setAge(expected);
		int actual = emp.getAge();
		assertEquals(expected,actual);
			
		});
	}
}


