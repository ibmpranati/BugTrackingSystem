package com.ibm.bugtracking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestEmployee {

	@Test
	void testValidateEmail() {
		Employee employee = new Employee();
		String result = employee.validateEmail("abc.12@gmail.com");
		Assert.assertEquals("Valid Email ID", result);
	}
	
	@Test
	void testValidateEmailWithoutSymbol() {
		Employee employee = new Employee();
		String result = employee.validateEmail("abc.1.gmail.com");
		Assert.assertEquals("Invalid Email ID", result);
	}
}
