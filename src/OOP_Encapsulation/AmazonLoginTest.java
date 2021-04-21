package OOP_Encapsulation;

public class AmazonLoginTest {

	public static void main(String[] args) {
		login lp = new login();
		lp.setUsername("admin@gmail.com");
		lp.setPassword("admin");
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		//Seller
		login lp_seller = new login();
		lp_seller.setUsername("seller@gmail.com");
		lp_seller.setPassword("seller123");
		lp.doLogin(lp_seller.getUsername(), lp_seller.getUsername());
	}

}
