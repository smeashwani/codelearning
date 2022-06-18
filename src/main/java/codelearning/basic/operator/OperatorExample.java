package codelearning.basic.operator;

import java.util.Scanner;

/**
 * 
 * @author java
 *
 */
public class OperatorExample {
	public static void main(String[] args) {
//		System.out.println("=====ternary operator===========");
//		int a=10;
//		int b=20;
//		int c =0;
//		if(a >b) {
//			c= a;
//		}
//		if(b > a) {
//			c= b;
//		}
//		System.out.println(c);
//		c= a>b?a:b;
//		System.out.println(c);
//		System.out.println("=====logical operator===========");
//		
//		int p=51;
//		if( p++ > 2 || p++ > 10 || p++ > 1) {}
//		System.out.println(p);
//		
//		System.out.println("================");
//		if(p>11); {
//			System.out.println("p >11");
//		}
//		System.out.println("end");
//		
//		int s =10;
//		System.out.println(s >> 2);
//		System.out.println(s << 2);
//		
//		int cal = 2+3* 4 -3 / 2 + 1;
//		System.out.println(cal);
//		
//		System.out.println("============swtich======");
//		Scanner scan = new Scanner(System.in);
//		int marks=scan.nextInt();
//		switch (marks) {
//		default: System.out.println("Fail");break;
//		case 10: 
//		case 20: 
//		case 30: System.out.println("D");break;
//		
//		case 40: 
//		case 50: 
//		case 60: System.out.println("C");break;
//		
//		case 70: case 80: System.out.println("B");break;
//		
//		case 90: System.out.println("A");
//		}
//		
		kunal:
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==2 && j>=3 && j<= 5) {
					continue kunal;
				}
				System.out.println(i + " " + j);
			}
			System.out.println(".");
		}

	}

}
