package javaSessions;

public class StringReverse {

	public static void main(String[] args) {

		//Reversing the string
		String s = null;//muineles
		//System.out.println(reverseString(s));
//here this code is working for al the values
//numeric = 100
//char =m
//test
//testing
//null
//test123

//Assignment = JAVA_PYTHON_RUBY_JAVASCRIPT
		System.out.println("-------Assignment-Reverse String---------");
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String splitLang[] = lang.split("_");
		String rev = "";
		int length = splitLang.length;
		for (int i=0;i<=length-1;i++) {
			String revLang = splitLang[i];
			int len = revLang.length();
			for (int j = len-1 ; j>=0 ; j--) {
				rev = rev + revLang.charAt(j);
			}
			rev = rev.concat("_");
		}
		System.out.println(rev.trim());
	}
	
	public static String reverseString(String s) {
//if string is null, how to handle it
		if(s == null) {
			return"String is null";
		}
		int len = s.length();//8
//if my string is m only then reverse the string no need to go inside for loop
		if (len ==1) {
			return s;
		}
		String rev = "";
		for (int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
