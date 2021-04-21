package BuilderPackagePattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		EcommApp ec = new EcommApp();
		ec.doLogin("naveen", "naveen123")
			.serachProduct("macbook")
				.addToCart("macbook")
					.checkout("macbook")
						.doPayment("1111 222", "123")
							.getOrderDetails("Macbook")
								.logout("naveen");
		
		
		EcommApp ec1 = new EcommApp();
		ec1.doLogin("tom", "tom123")
			.getOrderDetails("Nike shoes")
				.logout("tom");
		
		EcommApp ec2 = new EcommApp();
		ec2.doLogin("abc", "abc123")
			.logout("abc");
	}

}
//uberApp
//features: launchApp, doLogin, bookCab, dropIn, makePayment,selectCar,logOut
//customers: cancelCar, cancelBooking, addBooking, myPrevoiousHistory, CompleteFlow
