package OOP_Interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical{
	//class to class inheritance - extends keyword
	//class to interface inheritance - implements keyword
	//interface to interface inheritance - extends keyword
	//without overriding no method can be called.
		
		
	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	}
//the moment i add any service in any interface, fortis class
//start throwing error, we must have its override method
	@Override
	public void radioServices() {
		System.out.println("FH - radioServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
	}

	@Override
	public void gynecServices() {
		System.out.println("FH - gynecServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
	}
	
	//there can be non overridden as well - defined by fortis hospital itself
	//these are independent methods
	
	public void medicalInsurance() {
		System.out.println("FH - medicalInsurance");
	}
	
	public void pathalogyServices() {
		System.out.println("FH - pathalogyServices");
	}
@Override
//default method is only for interface
//change it to public
	public void taxcollection() {
		System.out.println("US - tax collection....");
	}

@Override
	public void covidTest() {
		System.out.println("FH-----covidTest");	
	}
}
