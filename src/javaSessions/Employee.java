package javaSessions;

public class Employee {
	String name;
	int age;
	String dob;
	double salary;
	boolean isPermanent;

	public static void main(String[] args) {
		Employee e1 = new Employee ();
		e1.name = "Tom";
		e1.age = 25;
		e1.dob = "10-08-1995";
		e1.salary = 25.55;
		e1.isPermanent = true;
		System.out.println(e1.name);
		
		Employee e2 = new Employee();
		e2.name = "Tom";
	
		e2.dob = "10-08-1995";
		System.out.println(e2.isPermanent);
		System.out.println(e2.age);
	}

}
