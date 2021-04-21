package OOP_Inheritance;

	
public class BMW extends car {
	String name = "My BMW Car";
	//Method Overriding: (Dynamic) poly+morphism - run time polymorphism/dynamic polymorphism
	//it is also called dynamic binding and compile time polymorpism (overloading)is also called static binding.
	//this method -start method, is called as overridden method.
	//it is also called method overriding.
	//method overriding - when you have a method in parent and exactly same method in 
	//child class with the same name and same number of parameters with same types
	//why do we need method overriding - when child want to have its own method as parent have.
	
	@Override
	public void start() {
		System.out.println("BMW----------Start");
	}
	@Override
	public void engine() {
		System.out.println("BMW------Engine");
	}
	public void Autoparking() {
		System.out.println("BMW----------AutoParking");
	}
	
	//Static methods cannot be overridden
	public static void autoPilot() {
		System.out.println("Car-----AutoPilot");
	}
}
