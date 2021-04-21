package javaSessions;

import java.util.ArrayList;

public class PageLinks {
	// WAF you need to pass the page name and return the total links
			//and another function ----return the list of all links text on the page
			
	public int getLinksCount(String pageName) {
		int count = getPageLinksTextList(pageName).size();
		return count;
	}
	
	public ArrayList<String> getPageLinksTextList(String pageName) {
		System.out.println("getting page links text for : "+pageName);
		ArrayList<String> linksList = new ArrayList<String>();
		if(pageName.equals("Login Page")) {
			linksList.add("login");
			linksList.add("contact us");
			linksList.add("privacy policy");
		}
		else if(pageName.equals("Home Page")) {
			linksList.add("logout");
			linksList.add("wish list");
			linksList.add("business");
		}
		else {
			System.out.println("page is not available...");
		}
		return linksList;
	}
	public static void main(String[] args) {
		PageLinks p1 = new PageLinks();
		int c1 = p1.getLinksCount("Home Page");
		System.out.println(c1);
		ArrayList<String> HomeList= p1.getPageLinksTextList("Home Page");
		System.out.println(HomeList);
	}

}
