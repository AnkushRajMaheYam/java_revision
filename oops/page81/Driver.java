package java_revision.oops.page81;

public class Driver {
	public static void main(String[] args) {
		System.out.println("this is a driver class.");
		
		System.out.println("Calling of Browser Class.");
		
		Browser b1 = new Browser();
		
		b1.name="FireFox";
		b1.size=23.5;
		b1.version=2.3;
		
		System.out.println("The browser name is "+b1.name+" and size is "+b1.size+" and version is "+b1.version);
		b1.dataRetrive();
		b1.features();
		
		System.out.println("===========");
		
		
		System.out.println("Calling of School Class.");
		
		School s1 = new School();
		
		s1.name="ABC";
		s1.noOfStudents=2231;
		School.fees=2314.500; // direct call by class reference due to static members
		
		System.out.println("The school name is "+s1.name+" and no of Students is "+s1.noOfStudents+" and fees is "+s1.fees);
		School.teaching(); // direct call by class reference due to static method
		s1.playing();
		
		System.out.println("===========");
		
		System.out.println("Calling of Student Class.");
		
		Student st1 = new Student();
		
		Student.name="Ankush Raj"; // direct call and assign value by class reference due to static members
		st1.sid=2231;
		st1.age=23; 
		
		System.out.println("The student name is "+st1.name+" and Student Id is "+st1.sid+" and age is "+st1.age);
		Student.reading(); // direct call by class reference due to static method
		st1.playing();
		
		
		
	}
}
