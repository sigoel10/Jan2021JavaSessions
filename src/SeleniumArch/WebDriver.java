package SeleniumArch;

public interface WebDriver extends SearchContext{
	
	@Override
	public void findElement();//one interface can override another interface method
	
	public void get(String url);
	public void click(String element);
	public void sendKeys(String element, String value);
	public String title();
	public void quit();

}
