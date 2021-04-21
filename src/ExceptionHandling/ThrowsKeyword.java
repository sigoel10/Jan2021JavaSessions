package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException{
		m2();
	}
	
	public void m2 ()throws ArithmeticException {
		try{
			m3();
		}
		catch(ArithmeticException e) {
		System.out.println("ARE is coming");
		}
	}
	
	public void m3() throws ArithmeticException{
		int i = 9/0;
	}
	
	public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		
	}
//here we are just passing the exception from one method to another method
//m3 to m2, m2 to m1 and m1 to main
//now its JVM responsibility to handle the exception
//its not a good practice that my main method will handle the exception.
//we should handle the exception always in our methods from where actual exception  is coming
}
