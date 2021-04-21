package javaSessions;

public class FinalizeMethod {

	String name = "Tom";
	public static void main(String[] args) {

//whenever the garbage collector is going to destroy all the objects without any reference or having null reference
//so gc will check do you have any finalize method in your class
//if you have it, so before any cleanup activity or before destroying any object whatever you have written inside finalize method will be called
//		
		FinalizeMethod obj = new FinalizeMethod();
		obj=null;
//		
		System.gc();//gc will execute finalize method before destroying object
//super class of FinalizeMethod - Object
//Object class is the super class of all the classes
//every class in java will be the child of Object class

		
//ques - here creating object of another class, will gc will call finalioze method here?
//no, because in window class i don't have any finalize method
//I am creating the object of window class, window class object will get the null reference
//and this will check in window class do we have any finalize method
//before destroying the object, gc will check which class object reference is null
		
		Window w1 = new Window();
		w1 =null;
		System.gc();
		
		
		
		}
//here we are overriding finalize method-finalize method is coming from parent class-object class
	
	
	@Override
	public void finalize() {
			System.out.println("finalizeMethod ------- finalize");
	}

}
