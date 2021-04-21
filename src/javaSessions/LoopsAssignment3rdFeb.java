package javaSessions;

public class LoopsAssignment3rdFeb {

	public static void main(String[] args) {
System.out.println("--------Printing ASCII values from a to z---------");
		int i = 'a',j='z';
		while (i<=j) {
			System.out.println(i);
			i++;
		}
System.out.println("-----------1----------");
	int x = 1;
	while(x<=5) {
		System.out.println("I am Batman");
		x++;
	}
System.out.println("-----------2----------");
int a = 1;	
while(a<10) {
		System.out.println("I am Batman "+a);
		a++;
	}
System.out.println("-----------3----------");
for (int b=10;b>=1;b--) {
	System.out.println(b);
}
int p=10;
while(p>=1) {
	System.out.println(p);
	p--;
}
int m=10;
do {
	System.out.println(m);
	m--;
} while (m>=1);

System.out.println("-----------4----------");

String s = "Hello World";
int a4 = 1;
while(a4<=10) {
	System.out.println(s);
	a4++;
}

System.out.println("-----------5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered----------");
int a5 = 1;
while(a5<=10) {
	System.out.println(a5);
	if(a5%7 == 0) {
		break;
	}
	a5++;
}

System.out.println("-----------6. Print even number (0 2 4 6 8 10) using for/while/dowhile loop.----------");
for (int c1=0; c1<=10; c1=c1+2) {
	System.out.println(c1);
}

int c2=0;
while(c2<=10) {
	System.out.println(c2);
	c2=c2+2;
}

int c3=0;
do {
	System.out.println(c3);
	c3=c3+2;
}
while(c3<=10);


System.out.println("-----------7. Print odd number (1 3 5 7 9) using for/while/dowhile loop.----------");
for (int d1=1; d1<=10; d1=d1+2) {
	System.out.println(d1);
}

int d2=1;
while(d2<=10) {
	System.out.println(d2);
	d2=d2+2;
}

int d3=1;
do {
	System.out.println(d3);
	d3=d3+2;
}
while(d3<=10);
	}

}
