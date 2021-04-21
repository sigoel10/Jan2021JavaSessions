package javaSessions;

public class StringManipilation {

	public static void main(String[] args) {

		String st = "Hi this is my java code and I am so happy";
//string maintains a character array
		
System.out.println(st.length());//length of the string highest index = 40

System.out.println(st.charAt(0));//character on specific index

System.out.println(st.charAt(40));
//System.out.println(st.charAt(41));//exception string index out of bound

System.out.println(st.indexOf("i"));//index of a character
System.out.println(st.indexOf("i"));//first occurrence of i

System.out.println(st.indexOf("i", 2));//2nd occurrence of i
//but the problem of this line is 2 is hardcoded..
//if i change my string then 2nd occurrence will get affected

System.out.println(st.indexOf("i", st.indexOf("i")+1));
//find out 3rd occurrence of i??
//System.out.println(st.indexOf("i", st.indexOf("i")+1));

System.out.println(st.indexOf("code"));//index of a string
System.out.println(st.indexOf("hello"));//index of string is giving int value
//here string is not available in string then it returns -1

//Ex- we need to find if username is available on home page
String mesg = "Welcome null";
if (mesg.indexOf("admin")>0) {
	System.out.println("un is there");
}
else {
	System.out.println("un is not there");
}

System.out.println(st.toLowerCase());//converting entire string to lower case
System.out.println(st.toUpperCase());//converting entire string to upper case

String s1 = "   hello world   ";
//trim: will remove the spaces from the corner
System.out.println(s1.trim());

//Comparison: .equals //check if string is exactly same or not
String s2 = "this is selenium";
String s3 = "this is selenium";
System.out.println(s2.equals(s3));//.equals method gives boolean value

//contains: check if specific value is available or not; given boolean value
String message = "this is your email id naveen@gmail.com";
System.out.println(message.contains("naveen"));
String url = "http://amazon.com/product/macbook";
if(url.contains("macbook")) {
	System.out.println("url is correct");
}

String a = "testing";
String b = "Selenium";
int x = 100;
int y = 200;

System.out.println(a+b+x+y);
System.out.println(a.concat(b));//used for concatination of two strings
//concat methods doesn't take integer parameter

//substring: to get the portion of the string
String m = "your transaction id is 12345 ";

System.out.println(m.substring(3));
System.out.println(m.substring(5, 10));//up to, 10 don't include 10th value;(5,10]
System.out.println(m.substring(m.indexOf("is")+3,m.length()).trim());
System.out.println(m.substring(m.indexOf("is")+3).trim());

//split:return type is string array ; String[]
String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
String [] language =lang.split("_");
System.out.println(language.length);
for (String e: language) {
	System.out.println(e);
}
//ex: fill registration form with user information
String userData = "Tom;peter;01-01-1990;NY;USA;909090";
String user[] = userData.split(";");
for (String e:user) {
	System.out.println(e);
}

//interview question:
String test = "xXtestingxXXjavaXxXseleniumxXxpython";
String myTest[] = test.split("xX");
System.out.println(myTest[0]);//0th index value will be nothing blank value
//because split starts from xX so 0th position value will be blank
System.out.println(myTest[1]);
System.out.println(myTest[2]);
System.out.println(myTest[3]);
System.out.println(myTest[4]);
	
String seller = "seller|seller123";
String username = seller.split("\\|")[0];
String pwd = seller.split("\\|")[1];
System.out.println(username);
System.out.println(pwd);

String cred = "testing|test123|admin";
System.out.println(cred.split("\\|")[0]);
System.out.println(cred.split("\\|")[1]);
System.out.println(cred.split("\\|")[2]);

String credentials = "testing.test123.admin";
System.out.println(credentials.split("\\.")[0]);
System.out.println(credentials.split("\\.")[1]);
System.out.println(credentials.split("\\.")[2]);

//escaping character in the string
String str = "hi this is tom and I love JAVA";
System.out.println("hi this is \"tom\" and I love JAVA");

getInfo("username");

	}
//how to append values in xpath
	public static void getInfo(String value) {
		String xpath = "//input[@id='"+value+"']";
		System.out.println(xpath);
	}
	
}
