package com.ibm.bugtracking;

public class Employee {
	protected Project projectDetails;
	private int id;
	private String name;
	private String emailId;
	private int mobileNumber;
	
	Employee(){
		this.projectDetails = new Project();
		this.projectDetails.setName("OMS");
		this.projectDetails.setType(PROJECT_TYPE.ENTERPRISE_DEVELOPMENT);
		this.projectDetails.setProjectId(1200);
		this.projectDetails.setManagerId(1015);
		this.projectDetails.setTesterId(2015);
		this.projectDetails.setDeveloperId(3015);
	}
	
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
		String check = validateEmail(emailId);
		System.out.println(emailId + " : " + check);
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
	
	public String validateEmail(String emailId) {
		String valid;
		
		if (emailId.length() <= 2 || emailId.indexOf('@') == -1 || emailId.indexOf('.') == - 1) {
			valid = "Invalid Email ID";
		}
		else {
			valid = "Valid Email ID";
		}
		return valid;
	}
}
