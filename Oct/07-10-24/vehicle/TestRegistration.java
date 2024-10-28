package com.test.vehicle;
import java.util.Scanner;
public class TestRegistration {

	public static void main(String[] args) {
		 Registration r1 = new Registration();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Vehicle :");
		 String vehicle = sc.nextLine();
		 
		 System.out.println("Enter Owner :");
		 String Owner = sc.nextLine();
		 
		 System.out.println("Enter Registration Date :");
		 String  registrationDate = sc.nextLine();
		 
		 r1.setRegistrationDetails(vehicle, Owner, registrationDate);
		 String result = r1.getRegistrationDetails();
		 System.out.println(result);
		 sc.close();
	}

}
