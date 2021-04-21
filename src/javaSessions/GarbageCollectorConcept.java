package javaSessions;

public class GarbageCollectorConcept {
String name;
int age;
	public static void main(String[] args) {
		
		GarbageCollectorConcept e1 = new GarbageCollectorConcept();
		e1.name = "Tom";
		e1.age = 25;
		System.out.println(e1.name);
	//If i create object like below:
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
	//if i create more objects
	GarbageCollectorConcept e2 = new GarbageCollectorConcept();	
	GarbageCollectorConcept e3 = new GarbageCollectorConcept();
	
	//and here I am making object reference as null
	e2 = null;
	e3 = null;
	
	//how many objects are there in my program?--total 7 objects
	
	}
}
