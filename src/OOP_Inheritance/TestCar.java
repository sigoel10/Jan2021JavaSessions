package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();//overridden//here BMW method will be called
		b.stop(); //inherited//its coming from car
		b.refuel();//inherited
		b.Autoparking();//independent
		b.engine();//taking from grandparent
		BMW.autoPilot();
		System.out.println(b.name);
		
		Audi a = new Audi();
		System.out.println("Starting Audi");
		a.start();//parent method
		a.stop();//parent method
		a.refuel();//parent method
		a.theftSefty();//independent method
		a.engine();//grandparent method
		
		car c = new car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//taking from parent
		car.autoPilot();
		
		//bmw taking reference from parent
		//top/Up casting
		//here all the parent class methods can be accessed only if they are overridden
		//child class methods cannot be accessed
		//there is a security check (reference type check) will be applied
		//C1 is coming from car class but bmw has no reference
		car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//here I cannot access any method of BMW neither of car
		vehicle v1 = new BMW();
		v1.engine();
		
		//down casting:not allowed - it means you are giving parent class the child class reference.
		//if we do casting here, then it is allowed at compile time but at run time it will give an exception.
		//BMW b1 = (BMW) new car();//ClassCastException
		
	}
	//assignment - university--parent--3/4 methods
	//3 child classes - colleges - delhi college, IIT delhi, IIT Bombay--2/3 method
	//CentralUniversity--grant parent
	//test college class
}
