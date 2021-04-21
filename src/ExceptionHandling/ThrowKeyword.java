package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		
//whenever you want to generate your own exception
//deliberately you want to show some exception
		try {
		throw new Exception("SOME EXCEPTION");
		}catch(Exception e) {
		e.printStackTrace();
		}
//ex - data is coming from API, database or some excel sheet
		String data = "";
		
		if (data.equals("")) {
			try {
				throw new Exception ("DATA BLANK EXCEPTION");
			}catch(Exception e) {
			e.printStackTrace();
			System.out.println("data is coming blank from the backend/excel");
			System.out.println(e.getMessage());//if we want to print the excat message of exception
			}
		}
	}

}
