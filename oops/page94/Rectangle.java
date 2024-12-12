package java_revision.oops.page94;

public class Rectangle {
	double length;
	double width;
	
	public void setValue(double length, double width) {
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
