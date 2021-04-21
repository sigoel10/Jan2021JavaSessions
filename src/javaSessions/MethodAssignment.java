package javaSessions;

public class MethodAssignment {
//WAF using switch case statement where you have to pass student name and return marks
	public int getStudentMarks(String studentName) {
		int marks=0;
		System.out.println("get student marks");
		switch (studentName) {
		case "Tom":
			marks = 90;
			System.out.println(studentName+" got "+marks+" marks.");
			break;
		case "Raj":
			marks = 80;
			System.out.println(studentName+" got "+marks+" marks.");
			break;
		case "Peter":
			marks = 70;
			System.out.println(studentName+" got "+marks+" marks.");
			break;
		default:
			System.out.println("Student "+studentName+" is not available");
		}
		return marks;
	}

	public static void main(String[] args) {
		
		MethodAssignment obj = new MethodAssignment();
		obj.getStudentMarks("Peter");
		obj.getStudentMarks("test");
	}

}
