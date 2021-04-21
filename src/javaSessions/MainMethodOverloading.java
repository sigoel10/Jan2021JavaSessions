package javaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("This is my main method");
	}
	public static void main(int a) {
		System.out.println("This is main "+a);
	}
	public static void main(int a, int b) {
		System.out.println("This is main "+a +b);
	}
}
