package SeleniumArchNameChange;

public class Browser {
	public void launchBrowser() {
		System.out.println("Launching Browser");
		checkBrowserVersion();
	}
	private void checkBrowserVersion() {
		System.out.println("Check browser version");
		checkRAMSpace();
	}
	private void checkRAMSpace() {
		System.out.println("check RAM Space");
		OSCompatible();
	}
	private void OSCompatible() {
		System.out.println("OS Compatible");
		needUpgrade();
	}
	private void needUpgrade() {
		System.out.println("need Upgrade");
	}
	



}
