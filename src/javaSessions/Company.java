package javaSessions;

public class Company {
	String name;
	int empCount;
	String city;
	String address;
	String coeName;
	
	static String category = "IT";
	
//	public Company() {
//		System.out.println("default constructor....");
//	}
//	public Company(int a) {
//		System.out.println("One param constructor...." +a);
//	}
	public Company(int a, int b) {
		System.out.println("two param constructor...." +a+b);
	}
	public Company() {
		System.out.println("default constructor...");
	}
	public Company (String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	public Company (String name, int empCount, String city) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
	}
	
	public Company(String name, int empCount, String city, String address, String coeName) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
		this.address = address;
		this.coeName = coeName;
	}
	
}
