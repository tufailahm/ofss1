package com.training.ofss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class )
class PalindromeCheckTest {
	
	Utility util1 = new Utility();

	@Test
	@Order(2)
	@DisplayName(value="Second test case for malayalam")
	void test() {
		assertTrue(util1.checkPalindrome("malayalam"));
	}
	
	@Test
	@Order(3)
	@DisplayName(value="Third test case for hello")
	void test1() {
		assertFalse(util1.checkPalindrome("hello"));
	}
	
	@Test
	@DisplayName(value="First test case for empty string")
	@Order(1)
	void test2() {
		assertTrue(util1.checkPalindrome(""));
	}

}