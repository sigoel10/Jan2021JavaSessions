package SuperKeyword;

public class Car {
	
//Constructor of parent class
	public Car() {
		System.out.println("Car--------Constructor");
	}
	public Car(int i) {
		System.out.println("Car--------Constructor "+i);
	}
	int speed = 120;
	
	public void start() {
		System.out.println("Car-----------Start");
	}
	
	public void display() {
		System.out.println("Car------display");
	}

}
