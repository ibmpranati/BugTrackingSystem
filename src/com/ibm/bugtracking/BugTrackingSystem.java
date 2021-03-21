package com.ibm.bugtracking;

public class BugTrackingSystem {
	public static void main(String[] args) {
		Developer developer1 = new Developer(3020, "Raghu", "raghu.rv12gmail.com", 650252563);
		Tester tester1 = new Tester(2028, "Vaidehi", "vaid3420@gmail.com", 982402553);
		Manager manager1 = new Manager(1030, "Swati", "swati.mohan@gmail.com", 876543220);
			
		tester1.sendBugReport(developer1.getEmailId(), manager1.getEmailId());
		manager1.acknowledgeReport();
		manager1.assignBug();
		developer1.setBugStatus();
		tester1.setBugStatus();
		
		System.out.println("New bug has been detected, adding the details.");
		System.out.println(tester1.addNewBug());
	}
}
