package BuilderPackagePattern;

import java.util.ArrayList;

public class UniversityTest {

	public static void main(String[] args) {
//		University un1 = new University("OXFORD");
//		System.out.println(un1.name);
//		
//		University un2 = new University("OXFORD", "UK");
//		System.out.println(un2.name);
//		System.out.println(un2.country);
//		
//		University un3 = new University("OXFORD", "UK", "1906");
//		System.out.println(un3.name);
//		System.out.println(un3.country);
//		System.out.println(un3.establishedDate);
		
//		University un4 = new University("Oxford", "UK", "1906",);
		
		University un1 = new University();
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Engineering");
		courses.add("Medical");
		courses.add("MBA");
		
		
		un1.getName("Oxford")
			.getCountry("Oxford", "UK")
				.getUnivEstablishment("Oxford", "UK", "1906")
				    .getUnivCourses("Oxford", courses);
		
		
		
//					.getUnivCourses("Oxford", Arrays.asList("Engineering", "Medical", "MBA"));
					
		
	}

}
