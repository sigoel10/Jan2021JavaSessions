package OOP_Abstract;

public class LoginPage extends Page{
//logic here is - page class is defining the rule that every page should have header and title
//every class will have its own title and header
	
	@Override
	public void header() {
		System.out.println("LP----Header");
	}

	@Override
	public void title() {
		System.out.println("LP------title");
	}
//Can I override non abstract methods - yes
	@Override
	public void pageLoading() {
		System.out.println("Page loading....");
	}
	
	public void dologin(String un, String pwd) {
		System.out.println("login with: "+un+" : "+pwd);
	}
//can I create constructor of Login Page Class - yes
	public LoginPage() {
		System.out.println("LP-------Constructor");
	}
}
