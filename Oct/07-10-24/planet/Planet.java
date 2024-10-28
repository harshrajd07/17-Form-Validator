package com.planet;
public class Planet {
String planetName;
double mass;
double radius;

public void setPlanetDetails(String planetName, double mass, double radius){
	this.planetName=planetName;
	this.mass=mass;
	this.radius=radius;
	
}
public String getPlanetDetails(){
	return " "+planetName+" "+mass+"  "+radius+" ";
}

}
