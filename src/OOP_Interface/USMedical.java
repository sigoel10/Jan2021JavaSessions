package OOP_Interface;

public interface USMedical extends WHO{
	//Variables can be defined
	int min_fee = 10;//by-default its static and final in nature
//why its static - because we cannot create object of the interface so they cannot be called.
//and no one can change them--final	
	
	//no method body
	//only method declaration
	//only method prototype
	//cannot create object of the interface
	//cannot create constructor of the interface - 
	//because constructor will be called when you create the object
	//constructor and objects are applicable only and only for the class
	
	public void orthoServices();
//we cannot write static here because static methods cannot be overridden
//In interface methods cannot be static
	
//can we write private methods here? - no because we need to override interface methods
//if we make them private these methods cannot be overridden.
	
	public void neuroServices();
	
	public void emergencyServices();
	
	//method declaration and return is possible
	//public int test(int a);
	
	public void radioServices();

//After jdk1.8:
//1. can have static method in interface with body:
	public static void billing() {
		System.out.println("US - billing");
	}
	
//2. can have default method with method body:
	default void taxcollection() {
		System.out.println("US - tax collection....");
	}
//can this default method be override-yes
	
}
