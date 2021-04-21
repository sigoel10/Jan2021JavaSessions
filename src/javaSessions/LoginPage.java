package javaSessions;

public class LoginPage {
//Method Overloading (Poly+morphism)
	public void login() {
		System.out.println("Login");
	}
	public void login(int a) {
		
	}
	public void login (int c, int d) {
		
	}
	public void login (int c, String d) {
		
	}
	public void login (String d, int c) {
		
	}
	
	//Login method overloading
	
	public void doLogin() {
		System.out.println("Default Login");
	}
	public String doLogin(String username, String pwd) {
		System.out.println("Login with: "+username +": "+pwd);
		return "login is successfull";
	}
	public boolean doLogin(String username, String pwd, String role) {
		System.out.println("Login with: "+username +": "+pwd+": "+role);
		return true;
	}
	
	public void doLogin(Long phone, String pwd) {
		System.out.println("Login with: "+phone +": "+pwd);
	}
	public void doLogin(long phone, int otp) {
		System.out.println("Login with: "+phone +": "+otp+": ");
	}
	
	//Search
	public void search() {
	}

	public void search(String productName) {
		
	}
	public void search(String productName, int price) {
		
	}
public void search(String productName, int price, String color) {
		
	}
	
//Payment
public void doPayment(String cc, int pwd) {
	
}
public void doPayment(String cc, int otp, String pwd) {
	
}
public void doPayment(String UPI) {
	
}

//Uber app
public void bookingCar(String from, String to) {
	
}
public void bookingCar(String from, String to, String carType) {
	
}
public void bookingCar(String from, String to, String carType, int personCount) {
	
}

	public static void main(String[] args) {
		System.out.println("Start");
		LoginPage lp = new LoginPage();
		lp.doLogin();
		lp.doLogin(79879877, 123);
		if (lp.doLogin("admin","admin123", "admin")) {
			System.out.println("I am loggedin...");
		}
		String msg = lp.doLogin("Naveen", "naveen123");
		System.out.println(msg);
		
		
		//main method is the first entry point for any java class. 
		//preference will be given to main method only while execution of code.

	}

}
