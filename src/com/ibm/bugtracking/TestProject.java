package com.ibm.bugtracking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestProject {

	@Test
	void testCheckPriority() {
		Project project = new Project();
		String result = project.checkPriority(PRIORITY.LOW);
		Assert.assertEquals("Low Priority Bug.", result);
	}
	
	@Test
	void testCheckSeverity() {
		Project project = new Project();
		String result = project.checkSeverity(SEVERITY.CRITICAL);
		Assert.assertEquals("Critical Bug! Leads to shutdown.", result);
	}
}
