package java_revision.oops.page101;

public class Driver {
	public static void main(String [] args) {
		
		System.out.println("Fetech Circle");
		Circle c1 = new Circle(12.5);
		
		System.out.println("Perimeter of Circle is : "+c1.getPerimeter());
		System.out.println("Area of Circle is : "+c1.getArea());
		
		System.out.println("===========================");
		System.out.println("Fetech Rectangle");
		Rectangle r1 = new Rectangle(11,21);
		
		System.out.println("Area of Rectangle : "+r1.getArea());
		System.out.println("Perimeter of Rectangle : "+r1.getPerimeter());
	
	}
}
