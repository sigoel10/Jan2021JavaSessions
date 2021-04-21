package javaSessions;

public class MethodChaining {
//method chaing is can I call m2 inside m1 without creating an object.
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
	}
	public static void t1() {
		t2();
	}
	public static void t2() {
		t3();
	}
	public static void t3() {
	System.out.println("t3 method");
	}
	
	public static void main(String[] args) {
		MethodChaining ob1 = new MethodChaining();
		ob1.m1();
		t1();
	}
//so this called as method chaining, we don't need to create the object of each method.
//m1 will call m2 and m2 will call m3, this is method chaining.
}
