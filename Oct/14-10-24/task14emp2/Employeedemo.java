package com.task14emp2;
import java.util.Scanner;
public class Employeedemo {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("How many Object : ");
	 int noOfObj=sc.nextInt();
	 
	 for(int i=1;i<=noOfObj;i++) {
		 Employee employeeObject = Employee.getEmployeeObject();
		 System.out.println(employeeObject);
	 }
	 sc.close();
	 
	}

}
