package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW("320d");
//here first it will call parent class constructor then child class constructor
		System.out.println(b.speed);
		System.out.println(b.name);
		
		b.checkSpeed();
		b.display();

		
		
	}

}
