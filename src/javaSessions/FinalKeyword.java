package javaSessions;

public class FinalKeyword {

	public static void main(String[] args) {
//value of i is getting change
//when we declare it with final keyword, it becomes constant and we cannot change its value
//that's why error is coming on line 10 and 11
		final int i = 10;
//		i = 20;
//		i = 30;
//		
		System.out.println(i);

//ex-calculating salary, login page title, page logo
//logo should be constant
//no one can change the no of days
		final int days = 7;
		System.out.println(days * 10);
//Other ex - final keyword is also used to prevent inheritance
//A class declared with the final keyword cannot be the child class
//A method declared with the final keyword cannot be overridden
//to prevent inheritance and to prevent method overriding and to provide the constant value, we use final keyword

//finally - is a block-will be executed-doesn't matter if exception is coming or not
//code written inside finally block will always be executed		
	}

}
