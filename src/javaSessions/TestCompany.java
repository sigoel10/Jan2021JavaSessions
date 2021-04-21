package javaSessions;

public class TestCompany {

	public static void main(String[] args) {
		Company c1 = new Company("IBM", 1000);
			System.out.println(c1.name);
			System.out.println(c1.empCount);
		
		Company c2 = new Company("MS", 2000, "Bangalore");
			System.out.println(c2.name+" " +c2.empCount+"  "+c2.city);
			System.out.println(c2.address);
			
		Company c4 = new Company("TCS", 5000, "Pune", "test", "TATA");
		System.out.println(c4.name);
		System.out.println(c4.coeName);
		
//		Company c2 = new Company(10);
//		Company c3 = new Company (10,30);
//		c1.name = "IBM";
//		c1.empCount = 100;
//		
//		Company c2 = new Company();
//		c2.name = "IBM";
//		c2.empCount = 100;
//		
//		Company c3 = new Company();
//		c3.name = "IBM";
//		c3.empCount = 100;
		
//If I have to store the information about 100 companies, i need to create 100 objetcs.
//and I will have to store the values one by one for each object.

	}

}
