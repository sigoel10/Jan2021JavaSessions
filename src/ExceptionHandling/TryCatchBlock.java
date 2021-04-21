package ExceptionHandling;

public class TryCatchBlock {

	String name = "Tom";
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj = null;
		try {
		System.out.println(obj.name);//here i will get null pointer exception, exception will not be handled
		int i = 9/0;
		System.out.println("Bye...");//this code will not get executed because exception is coming on line 12
		System.out.println("Bye...");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
//property of exception is that, whenever exception occurred in the program, 
//immediately the program got terminated, it will not execute all the upcoming lines.
//if you dont know which exception may come, then you can write Exception here.
//Exception is the superclass of all the exceptions.
//one try can have multiple catch blocks
		
	}

}
