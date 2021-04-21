package BuilderPackagePattern;

public class UberTest {

	public static void main(String[] args) {
		UberApp ub = new UberApp();
		ub.launchApp("UberApp")
			.doLogin("tom", "tom123")
				.bookCab("tom")
					.selectCar("Tom", "Honda")
						.dropIn("Tom")
							.makePayment("Tom")
								.logout("Tom");
		
		UberApp ub1 = new UberApp();
		ub1.launchApp("UberApp")
			.doLogin("peter", "abc123")
				.logout("peter");
		
		UberApp ub2 = new UberApp();
		ub2.launchApp("UberApp")
			.doLogin("Shree", "shree123")
				.cancelBooking("Shree")
					.logout("Shree");
		UberApp ub3 = new UberApp();
		ub3.launchApp("UberApp")
			.doLogin("Sam", "sam123")
				.myPreviousHistory("Sam")
					.bookCab("Sam")
						.logout("Sam");
		
	}

}
