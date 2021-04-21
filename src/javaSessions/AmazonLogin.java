package javaSessions;

public class AmazonLogin {

	String username;
	String password;
	String role;
	// it cannot have any return
	//we will never write business logic inside the constructor
	public AmazonLogin (String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public AmazonLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public AmazonLogin() {
	}

	public AmazonLogin(String username) {
		this.username = username;
	}

	//create different features--means methods
	
	public void doLogin(String username, String password) {
		System.out.println("login with: "+username+"  " +password);
	}
	
	public void doLogin (String username, String password, String role) {
		System.out.println("login with: "+username+"  " +password+"  "+role);
	}
	
	public void forgotPassword(String username) {
	 //can i write this login inside the constructor? no
		System.out.println("forgot password with: "+ username);
	}
	public void signup() {
		
	}
}
