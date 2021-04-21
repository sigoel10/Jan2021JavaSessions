package javaSessions;

public class ArrayAssignment7thFeb {

	public static void main(String[] args) {
	//1. Print the pattern
		for (int i=0;i<4;i++) {
			for (int j=0;j<=9;j++) {
				System.out.print(i+""+j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
/*Question 2: Write a program to create a static Array, having following cricket data:
--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console using normal for/while loop and for each loop*/
	Object Player1[] = new Object[7];
	Player1[0] = "Sachin";
	Player1[1] = 20;
	Player1[2] = "India";
	Player1[3] = "11-Aug-1983";
	Player1[4] = 'M';
	Player1[5] = 12.33;
	Player1[6] = true;
	System.out.println("Player1Info: "+Player1[0]);
	for  (int p=0;p<7;p++) {
		System.out.print(Player1[p]+" ");
	}
	System.out.println("");
	
	Object Player2[] = new Object[7];
	Player2[0] = "Virat";
	Player2[1] = 23;
	Player2[2] = "India";
	Player2[3] = "11-Sep-1983";
	Player2[4] = 'M';
	Player2[5] = 50.33;
	Player2[6] = true;
	System.out.println("Player2Info: "+Player2[0]);
	int q = 0;
	while (q<7) {
		System.out.print(Player2[q]+" ");
		q++;
	}
	System.out.println("");
	
	Object Player3[] = new Object[7];
	Player3[0] = "Kohli";
	Player3[1] = 23;
	Player3[2] = "India";
	Player3[3] = "11-Sep-1983";
	Player3[4] = 'M';
	Player3[5] = 50.33;
	Player3[6] = true;
	System.out.println("Player3Info: "+Player3[0]);
	for(Object r:Player3) {
		System.out.print(r+" ");
	}
	}

}
