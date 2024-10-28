package com.Task16rectangle;

public class Rectangle {
private double width;
private double height;
public Rectangle(double width, double height) {
	super();
	if(width <=0 || height <=0){
		System.err.println("Width and Height must be non-negative.");
		System.exit(0);
	}
	else {
	this.width = width;
	this.height = height;
}
}
public double getArea(){
 double Area = this.width * this.height;
System.out.println("Area : "+Area);
return Area;
}
public double getPerimeter(){
double Perimeter =  2 * (this.height+this.width);
System.out.println("Perimeter: "+Perimeter);
return Perimeter;
}
@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}

}
