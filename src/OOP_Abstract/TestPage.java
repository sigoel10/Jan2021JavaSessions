package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
//Can I create the object of abstract class - NO, not allowed
		
		LoginPage lp = new LoginPage();
		lp.dologin("admin", "admin");
		
		lp.header();
		lp.title();
		
//when we call overridden method-preference will be given to object reference-
//Login Page (pageLoading) method will be called
//this is run time polymorphism.overridding is always runtime polymorphism
		lp.pageLoading();

		
//here child class object is created will it call the abstract class constructor?
		//if child class doesn't have const..-------Parent Class const..will be called
		//if child class and parent class both have const...------
		//both const will be called first parent class (Page) const.. will be called then child class(LoginPage) const...will be called.
	
		//abstract class object cannot be created.
		//Page pg = new Page();
	
		//topcasting is allowed?-yes but will it fail at compile time-no
//why compile time topcasting is allowed in abstract classes but not in interface
		//because 
		Page pg = new LoginPage();
		pg.title();
		pg.header();
		//downcasting is allowed?-no, will get class cast exception at run time
		//LoginPage lp = new Page();
		//downcasting at the compile time is possible?-NO because we cannot create the object of abstract class and intefaces
		
	}
	

}
