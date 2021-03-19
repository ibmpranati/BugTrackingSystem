package com.ibm.bugtracking;

public class Tester extends Employee{
	
	private boolean issue;
	
	Tester(int id, String name, String emailId, int mobileNumber){
		this.setId(id);
		this.setName(name);
		this.setEmailId(emailId);
		this.setMobileNumber(mobileNumber);
	}
	
	public void addNewBug() {
		projectDetails.bugDetails.setId(103);
		projectDetails.bugDetails.setName("Image not visible.");
		projectDetails.bugDetails.setPriority(PRIORITY.HIGH);
		projectDetails.bugDetails.setLocation("Line 15");
		projectDetails.bugDetails.setType(TYPE.GUI);
		projectDetails.bugDetails.setProjectName("OMS");
		projectDetails.bugDetails.setStatus(STATUS.NEW);
		projectDetails.bugDetails.setBuildVersion("v2.3");
		projectDetails.bugDetails.setSeverity(SEVERITY.MAJOR);
		System.out.println("New Bug is added.");
	}
	
	public void setBugStatus() {
		if(projectDetails.bugDetails.getStatus() == STATUS.PENDING_RETEST) {
			projectDetails.bugDetails.setStatus(STATUS.RETEST);
			System.out.println("The defect is being retested.");
		}
		
		else if (projectDetails.bugDetails.getStatus() == STATUS.RETEST) {
			if(issue == true) {
				projectDetails.bugDetails.setStatus(STATUS.REOPEN);
				projectDetails.setDeveloperId(3018);
				System.out.println("This bug is assigned to developer with the ID : " + projectDetails.getDeveloperId());
			}
			else {
				projectDetails.bugDetails.setStatus(STATUS.VERIFIED);
				System.out.println("Verified");
			}
		}
		
		else if(projectDetails.bugDetails.getStatus() == STATUS.VERIFIED) {
			projectDetails.bugDetails.setStatus(STATUS.CLOSED);
			System.out.println("Bug resolved, closed.");
		}
		
		else if(projectDetails.bugDetails.getStatus() == STATUS.CLOSED) {
			System.out.println("Bug is closed. Cannot Reopen the Bug.");
		}
	}
	
	public void sendBugReport(String developerEmail, String managerEmail) {
		System.out.println("The bug report has been sent to " + developerEmail + " and " + managerEmail);
		System.out.println("BUG REPORT - ");
		System.out.println("Bug ID : " + projectDetails.bugDetails.getId());
		System.out.println("Bug Name : " + projectDetails.bugDetails.getName());
		System.out.println("Bug Priority : " + projectDetails.bugDetails.getPriority());
		System.out.println("Project Name : " + projectDetails.bugDetails.getProjectName());
		System.out.println("Location : " + projectDetails.bugDetails.getLocation());
		System.out.println("Bug Type : " + projectDetails.bugDetails.getType());
		System.out.println("Bug Status : " + projectDetails.bugDetails.getStatus());
		System.out.println("Bug Build Version : " + projectDetails.bugDetails.getBuildVersion());
		System.out.println("Bug Severity Level : " + projectDetails.bugDetails.getSeverity());
	}

	public boolean isIssue() {
		return issue;
	}

	public void setIssue(boolean issue) {
		this.issue = issue;
	}
}
