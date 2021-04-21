package BuilderPackagePattern;

import java.util.ArrayList;

public class Browser {
	String browserName;
	String vendorName;
	float currentVersion;
	ArrayList<String>pluginsSupported ;
	
	public Browser getBrowserName(String browserName) {
		System.out.println("Getting Browser Name: "+browserName);
		return this;
	}
	public Browser getVendorName(String browserName, String vendorName) {
		System.out.println("Browsername: "+browserName+" | "+vendorName);
		return this;
	}
	public Browser getVersion(float currentVersion) {
		System.out.println("verion: "+currentVersion);
		return this;
	}
	public Browser getPluginsList(ArrayList<String> pluginsSupported) {
		System.out.println("Plugins Supported: "+pluginsSupported);
		return this;
	}
	
	
}
