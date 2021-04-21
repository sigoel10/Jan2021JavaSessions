package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int i[]= new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2]= 30;
		System.out.println(i[0]);
		System.out.println(i.length);
		System.out.println("Print all the values of array using for loop");
		for (int k=0; k<i.length;k++) {
			System.out.println(i[k]);
			
			System.out.println("Double Array");
			double d[] = new double[2];
			d[0] = 12.33;
			d[1] = 36.02;
			System.out.println(d[0]+d[1]);
			
			System.out.println("Char Array");
			char c[] = new char[3];
			c[0] = 1;
			c[1] = 'a';
			System.out.println(c[0]);
			
			
			System.out.println("Object Static Array");
			Object obj[] = new Object[5];
			obj[0] = "test";	//String
			obj[2] = 30;		//integer
			obj[3] = 34.55;		//double
			obj[4] = true;		//boolean
			
			for (int n=0;n<obj.length;n++) {
				System.out.println(obj[n]);
			}
			
			
			
		}
		

	}

}
