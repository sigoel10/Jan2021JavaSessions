package javaSessions;

public class MethodsAssignment {

//Write a program to print the sum of two numbers entered by defining your own method.
	public void addition(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Addition of two numbers is: "+sum);
	}
//Define a method that returns the product of two numbers entered 	
	public int product (int num1, int num2) {
		int product = num1*num2;
		return product;
	}
//Write a program to print the circumference and area of a circle of radius entered by defining your own method.	
	public void circle (double r) {
		double pi = 3.14,area, circum;
		area = pi * r * r;
		System.out.println("Area of the circle is: "+area);
		circum = 2 * pi * r;
		System.out.println("Circumference of the circle is: "+circum);
	}
//Define two methods to print the maximum and the minimum number respectively among three numbers entered.
	public void maxNumber(int a,int b, int c) {
		if (a>b && a>c) {
			System.out.println("Greatest number is: "+a);
		}
		else if (b>c) {
			System.out.println("Greatest number is: "+b);
		}
		else {
			System.out.println("Greatest number is: "+c);
		}
	}
	
	public void minNumber(int a, int b, int c) {
		if (a<b && a<c) {
			System.out.println("Smallest number is: "+a);
		}
		else if (b<c) {
			System.out.println("Smallest number is: "+b);
		}
		else {
			System.out.println("Smallest number is: "+c);
		}
	}
//Define a program to find out whether a given number is even or odd.
	public void evennOdd(int a) {
		int rem = a%2;
		if (rem == 0) {
			System.out.println("Number "+ a +" is even");
		}
		else {
			System.out.println("Number "+ a +" is odd");
		}
		
	}
	
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out 
//if he/she is eligible to vote.
	public int getPersonAge(String person) {
		System.out.println("voting method");
		int age = 0;
		if (person.equalsIgnoreCase("Tom")) {
			return age=20;
		}
		else if (person.equalsIgnoreCase("peter")) {
			return age=10;
		}
		else {
			System.out.println("Please enter valid person name");
			return -1;
		}
	}
//Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades
	public void getStudentGrade(String Student, int marks) {
		if (marks>90 && marks<=100) {
			String grade = "AA";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		} else if (marks>80 && marks<=90) {
			String grade = "AB";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}else if (marks>70 && marks<=80) {
			String grade = "BB";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}else if (marks>60 && marks<=70) {
			String grade = "BC";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}else if (marks>50 && marks<=60) {
			String grade = "CD";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}else if (marks>40 && marks<=50) {
			String grade = "DD";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}else if (marks<=40) {
			String grade = "Fail";
			System.out.println("Student "+ Student +" got "+marks+" marks And Grade is : "+grade);
		}
		else {
			System.out.println("Please enter correct marks");
		}
	}
	
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
	public void factorial(int num) {
		int factorial = 1;
		for (int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+num+" is "+factorial);
	}
	
	public static void main(String[] args) {
		MethodsAssignment ms = new MethodsAssignment();
		ms.addition(5,6);
		int product = ms.product(12, 13);
		System.out.println("Product of two numbers is: "+product);
		ms.circle(3.0);
		ms.maxNumber(19, 13, 50);
		ms.minNumber(10, 6, 2);
		ms.evennOdd(101);
		String person = "Sita";
		int age = ms.getPersonAge(person);
		if (age>=18) {
			System.out.println(person+" is eligible to vote. Age is: "+age);
		}
		else if (age<18 && age>0) {
			System.out.println(person+" is not eligible to vote. Age is: "+age);
		}
		else {
			System.out.println("Person is not available");
		}
		
		ms.getStudentGrade("Tony", 100);
		ms.getStudentGrade("Tom", 0);
		
		ms.factorial(9);
	}
	
}
