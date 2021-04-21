package javaSessions;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20); //10020
		
//Conversion from string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
//while reading data from webpage data will be read in the form of string
//where we need to convert that string into integer
//Integer is the wrapper class
//parse int is the static method that's why we are able to call it directly
		
//Conversion form String to double
		String y = "12.33";
		System.out.println(y+20);
		
		Double d = Double.parseDouble(y);
		System.out.println(d+20);
	
		String f = "true";
		if (Boolean.parseBoolean(f)) {
			System.out.println("Hi...");
//it is used while reading data from property file
			
			String t = "100A";
			//int k = Integer.parseInt(t);//number format exception
			//System.out.println(k+20);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
//Assignment: converting string to int and perform arithmetic operation
	System.out.println("Assignment: converting string to int and perform arithmetic operation");
			String t1 = t.substring(0, 3);
			System.out.println(t1);
			int k1 = Integer.parseInt(t1);
			System.out.println(k1+20);

//Conversion: int to String
			int total = 100;
	//on web page we need to use string data through sendkeys method
			String tot = String.valueOf(total);
			System.out.println(tot+20);
			
//performing above operationwithout valueof method:
			
			System.out.println(total+""+20);
			
		}
	}

}
