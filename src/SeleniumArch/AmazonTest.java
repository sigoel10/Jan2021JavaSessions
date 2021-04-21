package SeleniumArch;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "ie";
		WebDriver driver = null;
		//ChromeDriver driver = new ChromeDriver();
		
		
		//if i want to do the same thing with another browser
		//so i will have to write the same thing again 
		//If I want to run this for safari browser, again i will have to write the same code
		//problem with this code is i can use only one browser at a time
		//so here i should use top casting to overcome this probelm
		//Top casting - child class object is referred by parent interface reference variable
		
		switch (browser) {
		case "chrome":
			 driver = new ChromeDriver();
			break;
		case "safari":
			 driver = new SafariDriver();
			break;
		case "firefox":
			 driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Browser not found....");
			break;
		}
		
		driver.get("https://www.amazon.com");
		String Title = driver.title();
		System.out.println(Title);
		
		driver.click("sign up link");
		driver.sendKeys("firstname", "Naveen");
		driver.quit();
				
	}

}
