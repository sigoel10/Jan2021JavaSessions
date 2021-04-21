package OOP_Interface;

public class ApolloTest extends FortisHospital {

	public static void main(String[] args) {
		ApolloHospital ap = new ApolloHospital();
		ap.cardioServices(); //accessing parent interface methods
		ap.emergencyServices();//accessing parent interface methods
		
		ap.Staff();//accessing independent method of apollo hospital class
		ap.covidTest();	//accessing grand-parent method
		ap.RD(); //accessing another class (medical) method, AplloHospital is accessing Medical class
		
		System.out.println(USMedical.min_fee);//accessing interface variable by its name
		USMedical.billing();//accessing static method of interface by its name
		
		//top-casting-only reference interface methods can be called
		USMedical us = new ApolloHospital();
		us.neuroServices();
		us.orthoServices();
		
		
		FortisHospital fh = new FortisHospital();
		fh.medicalInsurance(); //accessing sibling class methods
	}

}
