package java_revision.oops.page94;

public class Circle {
	
	double radius;
	
	public void setRadius(double radius) {
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
