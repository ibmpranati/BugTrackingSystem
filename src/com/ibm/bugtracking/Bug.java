package com.ibm.bugtracking;

public class Bug{
	private int id;
	private String name;
	private PRIORITY priority;
	private String projectName;
	private String location;
	private TYPE type;
	private STATUS status;
	private String buildVersion;
	private SEVERITY severity;
	
	Bug(){
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id == 0) {
			System.out.println("ID is required.");
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			System.out.println("Bug name is required.");
		}
		this.name = name;
	}
	public PRIORITY getPriority() {
		return priority;
	}
	public void setPriority(PRIORITY priority) {
		if (priority == null) {
			System.out.println("Please enter the priority.");
		}
		this.priority = priority;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		if (projectName == null) {
			System.out.println("Project name is required.");
		}
		this.projectName = projectName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if(location == null) {
			System.out.println("Please enter location of bug.");
		}
		this.location = location;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		if(type == null) {
			System.out.println("Bug Type is required.");
		}
		this.type = type;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		if(status == null) {
			System.out.println("Please enter the status of the Bug.");
		}
		this.status = status;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		if(buildVersion == null) {
			System.out.println("Please enter the build version.");
		}
		this.buildVersion = buildVersion;
	}
	public SEVERITY getSeverity() {
		return severity;
	}
	public void setSeverity(SEVERITY severity) {
		if(severity == null) {
			System.out.println("Severity of the bug is required.");
		}
		this.severity = severity;
	}
	
}
