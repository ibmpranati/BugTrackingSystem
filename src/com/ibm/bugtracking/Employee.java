package com.ibm.bugtracking;

public class Employee {
	protected Project projectDetails;
	private int id;
	private String name;
	private String emailId;
	private int mobileNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Project getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(Project projectDetails) {
		this.projectDetails = new Project();
		this.projectDetails.setName("OMS");
		this.projectDetails.setType(PROJECT_TYPE.ENTERPRISE_DEVELOPMENT);
		this.projectDetails.setProjectId(1200);
		this.projectDetails.setManagerId(1015);
		this.projectDetails.setTesterId(2015);
		this.projectDetails.setDeveloperId(3015);
		this.projectDetails = projectDetails;
	}
	
}
