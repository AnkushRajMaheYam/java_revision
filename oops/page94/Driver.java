package java_revision.oops.page94;

public class Driver {
	public static void main(String [] args) {
		
		System.out.println("Fetech Circle");
		Circle c1 = new Circle();
		c1.setRadius(12);
		
		System.out.println("Perimeter of Circle is : "+c1.getPerimeter());
		System.out.println("Area of Circle is : "+c1.getArea());
		
		System.out.println("===========================");
		System.out.println("Fetech Rectangle");
		Rectangle r1 = new Rectangle();
		r1.setValue(21, 8);
		
		System.out.println("Area of Rectangle : "+r1.getArea());
		System.out.println("Perimeter of Rectangle : "+r1.getPerimeter());
		
		System.out.println("===========================");
		System.out.println("Fetech School");
		
		School s1 = new School();
		s1.setdtails(4000, "Bestech Public School", 1500);
		s1.getDetails();
		
		
		System.out.println("===========================");
		System.out.println("Fetech Weapon");
		
		Weapon w1 = new Weapon();
		w1.setValue("AK47", 4, 5.06);
		
		w1.getDetails();
		
		
		
		
		
		
	}
}
