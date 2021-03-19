package com.ibm.bugtracking;

public class Project {
	protected Bug bugDetails;
	private int projectId;
	private int developerId;
	private int testerId;
	private int managerId;
	private String name;
	private PROJECT_TYPE type;
	
	Project(){
		this.bugDetails = new Bug();
		this.bugDetails.setId(101);
		this.bugDetails.setName("Incorrect Syntax");
		this.bugDetails.setPriority(PRIORITY.MEDIUM);
		this.bugDetails.setProjectName("OMS");
		this.bugDetails.setLocation("Line 20");
		this.bugDetails.setType(TYPE.SYNTAX);
		this.bugDetails.setStatus(STATUS.NEW);
		this.bugDetails.setBuildVersion("v1.0.1");
		this.bugDetails.setSeverity(SEVERITY.MINOR);
	}
	
	public String checkPriority(PRIORITY priority) {
		String bugPriority = "";
		
		if(priority == PRIORITY.HIGH) {
			bugPriority = "High Priority Bug! Needs to be resolved as soon as possible.";
		}
		
		else if(priority == PRIORITY.MEDIUM) {
			bugPriority = "Medium Priority Bug.";
		}
		
		else {
			bugPriority = "Low Priority Bug.";
		}
		return bugPriority;
	}
	
	public String checkSeverity(SEVERITY severity) {
		String bugSeverity = "";
		
		if(severity == SEVERITY.BLOCKER) {
			bugSeverity = "Blocker Bug! Leads to crashing of environment.";
		}
		
		else if(severity == SEVERITY.CRITICAL) {
			bugSeverity = "Critical Bug! Leads to shutdown.";
		}
		
		else if(severity == SEVERITY.MAJOR) {
			bugSeverity = "Major Level Bug.";
		}
		
		else if(severity == SEVERITY.MINOR) {
			bugSeverity = "Minor Level Bug.";
		}
		
		else {
			bugSeverity = "Low Impactful Bug.";
		}
		return bugSeverity;
	}
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public int getTesterId() {
		return testerId;
	}

	public void setTesterId(int testerId) {
		this.testerId = testerId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PROJECT_TYPE getType() {
		return type;
	}

	public void setType(PROJECT_TYPE type) {
		this.type = type;
	}
	
//	public Bug getBugDetails() {
//		return bugDetails;
//	}
//
	public void setBugDetails() {
		this.bugDetails = new Bug();
		this.bugDetails.setId(101);
		this.bugDetails.setName("Incorrect Syntax");
		this.bugDetails.setPriority(PRIORITY.MEDIUM);
		this.bugDetails.setProjectName("OMS");
		this.bugDetails.setLocation("Line 20");
		this.bugDetails.setType(TYPE.SYNTAX);
		this.bugDetails.setStatus(STATUS.NEW);
		this.bugDetails.setBuildVersion("v1.0.1");
		this.bugDetails.setSeverity(SEVERITY.MINOR);
	}
	
	
	public void addProject() {
		System.out.println("Project has been successfully added.");
	}
	
	public void updateProject() {
		System.out.println("Project details have been updated.");
	}
	
	public void deleteProject() {
		System.out.println("Project has been successfully completed.");
	}

}
