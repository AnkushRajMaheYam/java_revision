package java_revision.oops.page94;

public class School {
	int noOfStudents;
	String name;
	double fees;
	
	public void setdtails(int noOfStudents, String name, double fees) {
		this.noOfStudents=noOfStudents;
		this.name=name;
		this.fees=fees;
	}
	
	public void getDetails() {
		System.out.println("School Name : "+name);
		System.out.println("No of Students : "+noOfStudents);
		System.out.println("School Fees : "+fees);
	}
}

// https://github.com/AnkushRajMaheYam/java_revision