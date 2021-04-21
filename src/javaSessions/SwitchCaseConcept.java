package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String name = "Sam";
		switch (name) {
		case "Sam":
			System.out.println(name+"100 marks obtained");
			break;
		case "Tom":
			System.out.println(name+"50 marks obtained");
			break;
		case "Naveen":
			System.out.println(name+"10 amrks obtained");
			break;
		default:
			System.out.println("Student not found");
			break;
		}
//can we create switch with numbers
		int marks = 100; String grade= null;
		switch (marks) {
		case 100:
			grade="GRADE A";
			break;
		case 50:
			grade = "GRADE B";
			break;
		case 10:
			grade = "GRADE C";
			break;
		default:
			break;
		}
		System.out.println("Marks:"+marks+" Grade is:"+grade);
		
//WAP to print capital of India
		String country = "India";
		String capital = null;
		switch (country) {
		case "India":
			capital = "New Delhi";
			break;
		case "UK":
			capital = "London";
			break;
		case "US":
			capital = "DC";
			break;
		case "Germany":
			capital = "Munich";
			break;
		default:
			break;
		}
		System.out.println("Country is : "+country+" Capital is: "+capital);
//write a program to find out the highest number
		int x = 100, y=200, z=300;
		if (x > y && x > z) {
			System.out.println("x is greatest number");
		}
		else if (y > z) {
			System.out.println("y is greatest number");
		}
		else {
			System.out.println("z is greatest number");
		}
		

	}

}
