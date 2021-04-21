package javaSessions;

public class MethodConcept {

	public void test() {
		System.out.println("test method....");
	}
	public int getNumber() {
		System.out.println("get number");
		int a = 100;
		int b = 200;
		int c = a+b+500;
		return c;
	}
	
	public int add(int a, int b) {
		System.out.println("add method");
		int z = a+b;
		return z;
	}
	public String getTrainerName() {
		System.out.println("get Trainer Name");
		String name = "Naveen";
		return name;
	}
	
	//WAF where you have to pass the student name (string) and return marks(int)
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for: "+studentName);
		
		if (studentName .equals("Tom")){
			return 90;
		}
		else if (studentName.equals("Anu")) {
			return 95;
		}
		else if (studentName.equals("Raj")) {
			return 80;
		}
		else {
			System.out.println(studentName+" is not present..");
			return -1;
		}
	}
	
	public int getMyStudentMarks(String studentName) {
		System.out.println("getting marks for: "+studentName);
		int marks = -1;
		if (studentName .equals("Tom")){
			marks = 90;
		}
		else if (studentName.equals("Anu")) {
			marks = 95;
		}
		else if (studentName.equals("Raj")) {
			marks = 80;
		}
		else {
			System.out.println(studentName+" is not present..");
		}
		return marks;
	}	
	
//WAF where we have to pass the browser name (string) and return boolean
	
	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser "+browserName);
		boolean flag = false;
		switch (browserName) {
		case "chrome":
			System.out.println("Chrome is launched");
			flag=true;
			break;
		case "firefox":
			System.out.println("firefox is launched");
			flag=true;
			break;
		case "safari":
			System.out.println("Safari is launched");
			flag=true;
			break;
		default:
			System.out.println("Please pass the correct browser "+browserName);
			break;
		}
		return flag;
	}
//WAF where it will take emp name(string) and return emp information
//info: name age city phonenumber companyName
	
	public Object[] getEmpInfo(String empName) {
		System.out.println("Emp Name is: "+empName);
		Object empInfo[] = new Object [5];
		if (empName.equals("Disha")) {
		empInfo[0] = "Disha";
		empInfo[1] = 27;
		empInfo[2] = "Mumbai";
		empInfo[3] = 123456677;
		empInfo[4] = "IBM";
		}
		else if (empName.equals("Raj")) {
			empInfo[0] = "Raj";
			empInfo[1] = 30;
			empInfo[2] = "Pune";
			empInfo[3] = 45498122;
			empInfo[4] = "MS";
			}
		else {
			System.out.println(" emp not found");
		}
		return empInfo;
	}
	public static void main(String[] args) {
		
		MethodConcept obj = new MethodConcept();
		int sum1 = obj.add(10, 20);
		System.out.println(sum1);
		sum1 = obj.add(30, 40);
		System.out.println(sum1);
		obj.test();
		int sum = obj.getNumber();
		String n1 = obj.getTrainerName();
		System.out.println(n1);
		System.out.println(sum);
		System.out.println(obj.getNumber());
		int s1 = obj.add(10, 20);
		int makrs = obj.getStudentMarks("Naveen");
		System.out.println(makrs);
		
		int marks2 = obj.getMyStudentMarks("Tom");
		System.out.println(marks2);
		
		boolean b = obj.launchBrowser("chrome");
		System.out.println(b);
		if(b) {
			System.out.println("enter the url...");
		}
		
		Object dishaInfo[] = obj.getEmpInfo("Disha");
		System.out.println(dishaInfo.length);
		for(Object e:dishaInfo) {
			System.out.println(e);
		}
	}

}
