package com.ibm.bugtracking;

public class BugTrackingSystem {
	public static void main(String[] args) {
			Project project1 = new Project();
			Developer developer1 = new Developer(3020, "Raghu", "raghu.rv12@gmail.com", 650252563);
			Tester tester1 = new Tester(2028, "Vaidehi", "vaid3420@gmail.com", 982402553);
			Manager manager1 = new Manager(1030, "Swati", "swati.mohan@gmail.com", 876543220);
			
			project1.addProject();
			tester1.addNewBug();
			manager1.assignBug();
			developer1.setBugStatus();
			tester1.setBugStatus();
			tester1.sendBugReport();
			manager1.acknowledgeReport();
	}
}
