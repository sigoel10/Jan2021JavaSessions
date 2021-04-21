package javaSessions;

public class  ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a == b);
if (a == b) {
	System.out.println ("Both are equal");
}
else {
	System.out.println ("Both are not equal");
}

//WAP to compare two strings
	String s1 = "Automation";
	String s2 = "Automation";
	if (s1.equals(s2)) {
		System.out.println("Both are equal");
	}
	else {
		System.out.println("Both are not equal");
	}
	
//WAP to check marks
	String name = "Sam";
	if (name.equals("Sam")) {
		System.out.println("100 marks obtained");
	}
	if (name.equals("Tom")) {
		System.out.println("50 marks obtained");
	}
	if (name.equals("Naveen")) {
		System.out.println("10 marks obtained");
	}
	
	//with if-else-if
	if (name.equals("Sam")) {
		System.out.println("100 marks obtained");
	}
	else if (name.equals("Tom")) {
		System.out.println("50 marks obtained");
}
	else if (name.equals("Tom")) {
		System.out.println("50 marks obtained");
	}
	else {
		System.out.println("This studen is not found");
	}
}
}
