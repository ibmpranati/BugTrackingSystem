package com.ibm.bugtracking;

public class Manager extends Employee {
	
	Manager(int id, String name, String emailId, int mobileNumber){
		this.setId(id);
		this.setName(name);
		this.setEmailId(emailId);
		this.setMobileNumber(mobileNumber);
	}
	
	public void assignBug() {
		if(projectDetails.bugDetails.getStatus() == STATUS.NEW) {
			projectDetails.bugDetails.setStatus(STATUS.ASSIGNED);
			projectDetails.setDeveloperId(3019);
		}
		System.out.println("This bug is assigned to developer with the ID : " + projectDetails.getDeveloperId());
	}
	
	public void acknowledgeReport() {
		System.out.println("Report is received.");
	}
}
