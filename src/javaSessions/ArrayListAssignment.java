package javaSessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> color = new ArrayList<String>();
		color.add("pink");
		color.add("Blue");
		color.add("Orange");
		for(String c:color) {
			System.out.println(c);
		}
//2. Write a Java program to insert an element into the array list at the first and last positions.
	System.out.println("---------2-------------");	
	color.add(0, "Purple");
	color.add("Black");
	for(String e:color) {
		System.out.println(e);
	}
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	System.out.println("-------------3------------------");
	for (int i=0;i<=color.size();i++) {
		if (i==2) {
		System.out.println(color.get(i));
		break;}
	}
//4. Write a Java program to update specific array element by given element.
	System.out.println("-------------4----------------");
	System.out.println(color.size());
	for (int i=0;i<color.size();i++) {
		System.out.println(color.get(i));
		if (color.get(i).contentEquals("Blue")) {
			color.remove(i);
			color.add(i, "Green");
		}
	}
//5. Write a Java program to remove the third element from a array list. 
	System.out.println("-------------5----------------");
	color.remove(2);
	for (int i=0;i<color.size();i++) {
			System.out.println(color.get(i));
	}
//6. Write a Java program to search an element in a array list.
	System.out.println("-------------6----------------");
	for (String s:color) {
		if(s.contains("Green")) {
			System.out.println("Element Found");
			break;
		}
	}
	System.out.println("Element not found");
//7. Write a Java program to reverse elements in a array list
	System.out.println("-------------7----------------");
	color.add("reverse");
	for (String a:color) {
		System.out.println(a);
	}
	System.out.println("---reversing the elements---");
	for (int x=color.size()-1;x>=0;x--) {
		System.out.println(color.get(x));
	}
System.out.println("--Reversing through collections---");
	Collections.reverse(color);
	for(String e:color) {
		System.out.println(e);
	}
		
//8. Write a Java program to extract a portion of a array list.
	System.out.println("-------------8----------------");
	Collection<String> portion = color.subList(1, 3);
	for (String p:portion) {
		System.out.println(p);
	}
//9. Write a Java program of swap two elements in an array list.
	System.out.println("-------------9----------------");
	Collections.swap(color, 1, 4);
	for(String e:color) {
		System.out.println(e);
	}
//10. Write a Java program to empty an array list.
	System.out.println("-------------10----------------");
	//color.clear();
	System.out.println(color.size());
	
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
	System.out.println("-------------11----------------");
	color.trimToSize();
	System.out.println(color.size());
	
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	System.out.println("-------------12----------------");
	for (int i=0;i<color.size();i++) {
		System.out.println(color.get(i));
}
	
//Fill arrayListtill 14th segment and find out how many virtual segments are created
	System.out.println("---------ArrayList14th segment---------");
	ArrayList<String> numberNames = new ArrayList<String>();
	numberNames.add("One");
	numberNames.add("Two");
	numberNames.add("Three");
	numberNames.add("Four");
	numberNames.add("Five");
	numberNames.add("Six");
	numberNames.add("Seven");
	numberNames.add("Eight");
	numberNames.add("Nine");
	numberNames.add("Ten");
	numberNames.add("Eleven");
	numberNames.add("Twelve");
	numberNames.add("Thirteen");
	numberNames.add("Fourteen");
	numberNames.add("Fifteen");
	numberNames.add("Sixteen");
	
	}
}
