package java_revision.oops.page101;

public class Rectangle {
	double length;
	double width;
	
	Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	
	public double getArea() {
		double areaOfRectangle =length*width;
		return areaOfRectangle;
	}
	
	public double getPerimeter() {
		double periOfRectangle = 2*(length+width);
		return periOfRectangle;
	}
	
}
