package com.planet;
import java.util.Scanner;
public class Planetdemo {

	public static void main(String[] args) {
		Planet p1 = new Planet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Planet name : ");
		String planetName = sc.nextLine();
		
		System.out.println("Enter Planet Mass : ");
		Double mass = sc.nextDouble();
		
		System.out.println("Enter Planet Radius : ");
		Double radius = sc.nextDouble();
		
		p1.setPlanetDetails(planetName,mass,radius);
		String result = p1.getPlanetDetails();
		System.out.println(result);
		sc.close();
	}
}