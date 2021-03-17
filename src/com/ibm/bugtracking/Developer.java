package com.ibm.bugtracking;

public class Developer extends Employee {
	
	private String standard = "Appropriate";
	
	Developer(int id, String name, String emailId, int mobileNumber){
		this.setId(id);
		this.setName(name);
		this.setEmailId(emailId);
		this.setMobileNumber(mobileNumber);
	}
	
	public void setBugStatus() {
		if (projectDetails.bugDetails.getStatus() == STATUS.ASSIGNED) {
			projectDetails.bugDetails.setStatus(STATUS.OPEN);
			analyzeBug();
		}
		else if(projectDetails.bugDetails.getStatus() == STATUS.FIXED) {
			assignBugTester();
		}
		else if(projectDetails.bugDetails.getStatus() == STATUS.REOPEN) {
			analyzeBug();
		}
	}
	
	public void assignBugTester() {
		System.out.println("The bug has been fixed.");
		projectDetails.setTesterId(2019);
		System.out.println("The bug has been assigned to the tester with ID " + projectDetails.getTesterId());
	}
	
	public void analyzeBug() {
		if (standard.equals("Appropriate")) {
			System.out.println("Fixing the bug.");
			projectDetails.bugDetails.setStatus(STATUS.FIXED);
		}
		else if (standard.equals("Not Genuine")) {
			projectDetails.bugDetails.setStatus(STATUS.REJECTED);
		}
		else if (standard.equals("Similar")) {
			projectDetails.bugDetails.setStatus(STATUS.DUPLICATE);
		}
		else if (standard.equals("Low Priority")) {
			projectDetails.bugDetails.setStatus(STATUS.DEFERRED);
		}
		else if(standard.equals("Low Impact")) {
			projectDetails.bugDetails.setStatus(STATUS.NOT_A_BUG);
		}
		else {
			System.out.println("Wrong input");
		}
	}
}
