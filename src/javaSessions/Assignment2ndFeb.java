package javaSessions;

public class Assignment2ndFeb {

	public static void main(String[] args) {
		String browser = "CHROME";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser is Chrome");
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Browser is IE");
		}
		else if (browser.equalsIgnoreCase("Safari")) {
			System.out.println("Browser is Safari");
		}
		
		System.out.println("---------------------------");
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Browser is Chrome");
			break;
		case "ie":
			System.out.println("Browser is IE");
			break;
		case "safari":
			System.out.println("Browser is Safari");
			break;

		default:
			System.out.println("Browser not found");
			break;
		}
	System.out.println("----------Print ASCII values of a to z-----------------");
	int i = 'a';
	System.out.println(i);
	
	}
	}

