package OOP_Interface;
//Apollo Hospital and do same thing
//Apollo is  going to US, UK and India
//create method in apollo hospital and try to call fortis hospital methods
//can we call sibling methods-no
public class ApolloHospital extends Medical implements USMedical,UKMedical,IndianMedical{

	@Override
	public void covidTest() {
	System.out.println("AP------covidTest");
	}

	@Override
	public void cardioServices() {
	System.out.println("AP---------cardioServices");
	}

	@Override
	public void oncologyServices() {
	System.out.println("AP-----------oncologyServices");	
	}

	@Override
	public void physioServices() {
	System.out.println("AP-------physioServices");
	}

	@Override
	public void gynecServices() {
	System.out.println("AP---------gynecServices");
	}

	@Override
	public void orthoServices() {
	System.out.println("AP---------orthoServices");	
	}

	@Override
	public void neuroServices() {
	System.out.println("AP---------neuroServices");
	}

	@Override
	public void emergencyServices() {
	System.out.println("AP--------------emergencyServices");
	}

	@Override
	public void radioServices() {
	System.out.println("AP------------radioServices");
	}
	
	public void Staff() {
		System.out.println("Apollo independent method-----staff");
	}
}
