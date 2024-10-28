package com.task14emp2;
import java.util.Scanner;
public class Employee {
private int employeeId;
private String employeeName;
private double employeeSalary;

public Employee(int employeeId, String employeeName, double employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}

public static Employee getEmployeeObject() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee Id : ");
	int id = sc.nextInt();
	
	if(id<0) {
		System.out.println("Employee id is not Positive : ");
		System.exit(0);
	}
	
	System.out.println("Enter Employee Name : ");
	String name  = sc.nextLine();
	name = sc.nextLine();
	
	System.out.println("Enter Employee Salary: ");
	Double salary = sc.nextDouble();
	sc.close();
	return new Employee(id, name, salary);
	
	
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}
 


}
