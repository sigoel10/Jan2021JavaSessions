package javaSessions;

public class NullReferenceConcept {

	String name;
	int age;
	public static void main(String[] args) {
		
		NullReferenceConcept obj = new NullReferenceConcept();
		obj .name = "Tom";
		obj.age = 25;
		obj = null;
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}
