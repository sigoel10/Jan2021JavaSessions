package OOP_InheritanceAssignment;

public class CollegeTest {

	public static void main(String[] args) {
		IITDelhi del = new IITDelhi();
		del.EngineeringCollege();
		del.streams();
		del.name();
		
		University uni = new IITDelhi();
		uni.PGPrograms(); 
		uni.name();
		
		IITBombay bom = new IITBombay();
		bom.EngineeringCollege();
		IITBombay.streams(); //calling static method
	}
	
	
}
