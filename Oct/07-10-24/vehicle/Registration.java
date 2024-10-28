package com.test.vehicle;

public class Registration {
String vehicle;
String owner;
String registrationDate;

public void setRegistrationDetails(String vehicle, String owner,String registrationDate) {
	this.vehicle = vehicle;
	this.owner=owner;
	this.registrationDate=registrationDate;
}
public String getRegistrationDetails(){
	return " "+vehicle+" "+owner+" "+registrationDate+" ";
}
}
