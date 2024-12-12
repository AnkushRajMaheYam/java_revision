package java_revision.oops.page94;

public class Weapon {
	int round;
	String name;
	double range;
	
	public void setValue(String n, int rd, double rg) {
		name=n;
		round=rd;
		range=rg;
	}
	
	public void getDetails() {
		System.out.println("Weapon Name : "+name);
		System.out.println("No of Rounds : "+round);
		System.out.println("Fire Range : "+range);

	}
}
