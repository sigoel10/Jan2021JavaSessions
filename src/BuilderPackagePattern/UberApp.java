package BuilderPackagePattern;

public class UberApp {
	
	public UberApp launchApp(String title) {
		System.out.println("Launching "+title);
		return this;
	}
	public UberApp doLogin(String username, String password) {
		System.out.println("Login with: "+username +" and "+password);
		return this;
	}
	public UberApp myPreviousHistory (String username) {
		System.out.println("Previous History for : "+username);
		return this;
	}
	
	public UberApp bookCab(String username) {
		System.out.println("Booking cab for "+username);
		return this;
	}
	public UberApp selectCar (String username, String carModel) {
		System.out.println("Car selected by user: "+username+ "  " +carModel);
		return this;
	}
	public UberApp dropIn(String username) {
		System.out.println(username+ " dropeed in");
		return this;
	}
	public UberApp makePayment(String username) {
		System.out.println("Payment successfull for: "+ username);
		return this;
	}
	public UberApp cancelBooking(String username) {
		System.out.println("Cancelling booking for "+ username);
		return this;
	}
	
	public UberApp logout (String username) {
		System.out.println(username+" logged out from application");
		return this;
	}
}
