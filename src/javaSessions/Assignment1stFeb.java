package javaSessions;

public class Assignment1stFeb {

	public static void main(String[] args) {

//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//Hello 
//Naveen K
		System.out.println("Hello");
		System.out.println("Shraddha Goel");

//2. Write a Java program to print the sum of two numbers. 
//Test Data: 
//74 + 36 
//Expected Output :
//110
	int num1 = 74;
	int num2 = 36;
	System.out.println(num1+num2);

//3. Write a Java program to divide two numbers and print on the screen. 
//Test Data : 
//50/3
//Expected Output :
//16
int a = 50;
int b = 3;
System.out.println(a/b);

//4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9 
//c. 20 + -3*5 / 8 
//d. 5 + 15 / 3 * 2 - 8 % 3 
//Expected Output :
//43 
//1 
//19  
//13
int a1 = -5, a2 = 8,a3 = 6;
System.out.println(a1 + a2 * a3);
int b1 = 55, b2 = 9;
System.out.println((b1 + b2)% b2);
int c1 = 20, c2 = -3, c3 = 5, c4 = 8;
System.out.println(c1+(c2*c3)/c4);
int d1 = 5, d2 = 15, d3 = 3, d4 = 2, d5 = 8;
System.out.println(d1+(d2/d3)*d4-(d5%d3));

//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//Expected Output
//2.138888888888889
float f1 = 25.5f, f2 = 3.5f, f3 = 40.5f, f4 = 4.5f;
System.out.println((f1*f2-f2*f2)/(f3-f4));

//6. Try to concat "Hello Selenium" with a character 't'.
String s1 = "Hello Selenium";
char c11 = 't';
System.out.println(s1+c11);

//7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//"Your Toal amount is. 3700".
int p1 = 100, p2 = 200, p3 = 3400;
int sum = p1+p2+p3;
System.out.println("Your Total amount is. "+sum);

//8. What should be the output for :
byte b3 = 065; 
System.out.println(b3);

	}

}
