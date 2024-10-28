package com.task15sports;

public class Sports {
private String sportName;
private int teamSize;
private String sportType;
public Sports() {
// as it is instance variable and by default JVM takes it int as 0 , string as null.
}

public Sports(String sportName, int teamSize) {
	super();
	if(sportName==null) {
		System.err.println("Error 1");
		System.exit(0);
	}
	if(teamSize<=0) {
		System.err.println("Error 2");
		System.exit(0);
	}
	else {
	this.sportName = sportName;
	this.teamSize = teamSize;
	}
}

public Sports(String sportName, int teamSize, String sportType) {
	super();
	if(sportName==null) {
		System.err.println("Error 3");
		System.exit(0);
	}
	if(teamSize<=0) {
		System.err.println("Error 4");
		System.exit(0);
	}
	if(sportType==null) {
		System.err.println("Error 5");
		System.exit(0);
	}
	else {
	this.sportName = sportName;
	this.teamSize = teamSize;
	this.sportType = sportType;
	}
}

public void displayInfo(){
	
	System.out.println("Enter name of Sport : "+sportName);
	System.out.println("Enter Team Size : "+teamSize);
	System.out.println("Enter Sport Type : "+sportType);
	}
}
