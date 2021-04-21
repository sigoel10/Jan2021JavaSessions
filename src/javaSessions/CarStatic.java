package javaSessions;

public class CarStatic {

	String name;
	int price;
	String color;
	//making this static
	static int wheels = 4;
	
	public static void start() {
		System.out.println("car---start");
	}
	public static void start(String key) {
		System.out.println("car---start");
	}
	public void steering() {
		System.out.println("car------steering");
	}
	public void login() {
		
	}
	public void login(int a) {
		
	}
	public static void main(String[] args) {
		
		//how to call static vars/ methods
		//no need to create the objects of the class
		//1. can be called directly with in same class
		System.out.println(wheels);
		//2. should be called by className.
		System.out.println(CarStatic.wheels);
		
		//for non static vars/methods
		//we have to create the objects
		
		CarStatic c1 = new CarStatic();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Black";
		wheels = 4;
		
		CarStatic c2 = new CarStatic();
		c2.name = "BMW";
		c2.price = 70;
		c2.color = "Black";
		c2.wheels = 4;//warning
		
		c1.steering();
		start();
		CarStatic.start();
		
	}

}
