package BuilderPackagePattern;

import java.util.ArrayList;

public class University {

	String name;
	String country;
	String establishedDate;
	ArrayList<String> courseProvided = new ArrayList<String>();
	

	public University getName(String name) {
		System.out.println("getting university name");
		return this;
	}
	public University getCountry(String name, String country) {
		System.out.println("University "+name+" is situated in: "+country);
		return this;
	}
	public University getUnivEstablishment(String name, String country, String establishedDate) {
		System.out.println("University "+name+"was established on "+establishedDate);
		return this;
	}
	public University getUnivCourses(String name, ArrayList<String> courseProvided) {
		System.out.println("Different courses provided in university "+name+" are: "+courseProvided);
		return this;
	}

}
