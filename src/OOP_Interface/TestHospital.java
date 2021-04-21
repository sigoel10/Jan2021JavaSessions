package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.gynecServices();
		
		fh.medicalInsurance();
		fh.pathalogyServices();
	
		System.out.println(USMedical.min_fee);
		USMedical.billing();//static method will be called by interface name
//can i create object of US medical-no because its an interface
		
		
		fh.RD();//class method will be called by creating the object of the class
				//here fh is extending medical
		
//Can I do top casting with the parent - yes
//Top casting: child class object is referred by parent interface ref variable

		USMedical us = new FortisHospital();

		us.orthoServices();
		us.emergencyServices();
		us.neuroServices();
		us.radioServices();
//if i am doing top-casting, only and only those methods allowed,available in reference object
//reference which satisfy reference check.
		
		
		
		
	}

}
