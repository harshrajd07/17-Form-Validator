package com.task10;
import java.util.*;
public class getsumOfRoundedValues {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a=sc.nextInt();
	System.out.println("Enter Second number: ");
	int b=sc.nextInt();
	System.out.println("Enter Third number: ");
	int c=sc.nextInt();
	int result =RoundedSum.sumOfRoundedValues(a,b,c);
	System.out.println("Result is :"+result);
	sc.close();
}
}
