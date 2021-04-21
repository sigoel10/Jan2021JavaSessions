package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi...");
		System.out.println("Hi...");
		
		try{
			int i = 9/0;
		}catch(ArithmeticException e) {
		System.out.println("ARE is coming");
		}
		
		
		finally {
			System.out.println("I am inside the finally block..");
			System.out.println("Close DB Connection");
//either exception is coming or not, it will go to finally block.
//finally block will always be executed
//ex - close DB connection, 
//can I write finally block with out trycatch - there is no significane of writing finally block then
//can I write finally with try only no catch--yes but its not a good practice
		}
			int n1 = getMarks("Naveen");
			System.out.println(n1);
		}
	public static int getMarks(String name) {
		if(name.equals("Tom")) {
			try{
				int i=9/0;
				return 70;
			}catch (Exception e) {
				return 80;
			}finally {
				return -1;//overwrite the return
				//finally will be executed doesn't matter exception is coming or not
			}
		}
		return 10;
	}
	
}
