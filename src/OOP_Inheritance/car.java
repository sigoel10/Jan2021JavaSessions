package OOP_Inheritance;

public class car extends vehicle {
	
	String name = "My Car";
	
	public void start() {
		System.out.println("car-----start");
	}
	public void stop() {
		System.out.println("car---------stop");
	}
	public void refuel() {
		System.out.println("Car-----refuel");
	}
	
	
	public static void autoPilot() {
		System.out.println("Car-----AutoPilot");
	}
}
