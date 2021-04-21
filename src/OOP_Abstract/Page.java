package OOP_Abstract;

public abstract class Page {
	//cannot create object of interface as well as abstract class also
	public abstract void header();
	public abstract void title();
	
	public void pageLoading() {
		System.out.println("Page loading....");
	}
	//Static method can also be written in abstract class
	public static void url() {
		System.out.println("App page----url");
	}
	
	public static void logo() {
		System.out.println("App page----logo");
	}
//can I create constructor of Page Class - yes, although object of abstract class cannot be created
//it will be called when you create the object of child class
//interface const.. is not allowed but abstract class constructor is allowed
	public Page() {
		System.out.println("Page---------Const");
	}
//How this class is different from an interface?
//abstract class can have both abstract and non abstract methods but its not possible with interface
	// if I have only abstract methods-----------yes its possible-----100% abstraction
	//If I have only non-abstract methods--------yes its possible------0% abstraction
	//If I have both abstract and non abstract methods-----yes---------partial abstraction
//when should we use interface and when should we go with abstract classes?
	//when we have to define the method body means any business logic that will remain same throughout the application
	//--go with abstract classes ex-page loading 30 secs should remain same through put the application, initial App url 
	//should remain same throughout the application
	//but as in US medical interface-when child class will take all the decisions i.e. where 100% abstraction is required, 
	//we should go with interfaces.
//Can I do top-casting here?
	
}
