package javaSessions;

public class ConditionalOperatorsAssignment4thFeb {

	public static void main(String[] args) {
		int x = 25;
		int y = 78;
		int z = 87;
		int m = 91;
		if (x>y && x>z && x>m) {
			System.out.println("greatest number is "+x);
		}
			else if (y>z && y>m) {
				System.out.println("greatest number is "+y);
			}
			else if (z>m){
				System.out.println("greatest number is "+z);
			}
			else {
				System.out.println("greatest number is "+m);
			}

System.out.println("-------Write a Java program to test a number is positive or negative.------------");

	int p = -11;
	if (p>0) {
		System.out.println("number is positive"+p);
	}
	else if (p<0) {
		System.out.println("number is negative"+p);
	}
	
System.out.println("-----Write a Java program to test a person is eligible for vote---------");
	
	int age=12;
	boolean alive = true;
	if (age>=18 && alive == true) {
		System.out.println("person is eligible for vote");
	}
	else if (age<=18 && alive == true) {
		System.out.println("Person is not eligible for vote");
	}
	else {
		System.out.println("Person does not exist");
	}
	
	}
}