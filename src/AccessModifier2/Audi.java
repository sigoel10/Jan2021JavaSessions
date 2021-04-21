package AccessModifier2;

import AccessModifiers.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		
		Car c = new Car();
		c.price = 100;
		
		Audi a = new Audi();
		a.color = "Red";
		a.price = 1000;
	}

}
