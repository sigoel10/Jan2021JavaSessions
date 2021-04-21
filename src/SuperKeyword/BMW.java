package SuperKeyword;

public class BMW extends Car{
	
	String name;
	
//constructor of child class	
	public BMW() {
		//here i want to call the const... of Car class explicitly
		//super keyword can be used inside the child class const...to call the parent class const....
		super(10);
		//super keyword should be the first statement in child class const...
		//super keyword should be used only one time
		//super();
		System.out.println("BMW--------Constructor");
	}
	
	public BMW (String name) {
		//super keyword should be the first statement always inside the constructor
		super(10);
		this.name=name;
	}
	
	int speed = 150;
	
	public void checkSpeed() {
		System.out.println(speed);
//using super keyword, we can access parent class properties
		System.out.println(super.speed);
	}
	public void display() {
		System.out.println("BMW------display");
//using super keyword, we can access parent class methods also
		super.display();
	}

}
