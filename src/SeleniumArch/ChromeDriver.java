package SeleniumArch;

public class ChromeDriver implements WebDriver{

	
//Can i create cont...of this class---yes its a simple class
	
	public ChromeDriver() {
		System.out.println("Launch chrome browser");
	}
	
	@Override
	public void findElement() {
		System.out.println("findElement");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url : "+url);
	}

	@Override
	public void click(String element) {
		System.out.println("Click on element: "+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Enter the value in element: "+element+" value = "+value);
	}

	@Override
	public String title() {
		System.out.println("Title of the page....");
		return "Some title";
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
		
	}

}
