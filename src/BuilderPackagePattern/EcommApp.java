package BuilderPackagePattern;

public class EcommApp {

	public EcommApp doLogin(String username, String password) {
		System.out.println("login with: "+username+" "+password);
		return this;//this is returning the current class object
	}
	
	public EcommApp serachProduct(String productName) {
		System.out.println("searching Product"+ productName);
		return this;
	}
	
	public EcommApp serachProduct(String productName, String color) {
		System.out.println("searching Product"+ productName+"  "+color);
		return this;
	}
	
	public EcommApp addToCart(String productName) {
		System.out.println("adding to cart:"+" "+ productName);
		return this;
	}
	public EcommApp checkout(String productName) {
		System.out.println("Checkout the product: "+productName);
		return this;
	}
	public EcommApp doPayment(String cc, String pwd) {
		System.out.println("payment done with: "+"  "+pwd);
		return this;
	}
	public EcommApp getOrderDetails(String productName) {
		System.out.println("getOrder details for : "+ productName);
		return this;
	}
	public EcommApp logout(String username) {
		System.out.println(username+" logout from application");
		return this;
	}
}
