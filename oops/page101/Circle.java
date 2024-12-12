package java_revision.oops.page101;

public class Circle {
	
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getArea() {
		double areaOfCircle = Math.PI*radius*radius;
		return areaOfCircle;
	}
	
	public double getPerimeter() {
		double periOfCircle = 2*Math.PI*radius;
		return periOfCircle;
	}
}
