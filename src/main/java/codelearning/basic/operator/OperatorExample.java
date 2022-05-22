package codelearning.basic.operator;

public class OperatorExample {
	public static void main(String[] args) {
		System.out.println("=====ternary operator===========");
		int a=10;
		int b=20;
		int c =0;
		if(a >b) {
			c= a;
		}
		if(b > a) {
			c= b;
		}
		System.out.println(c);
		c= a>b?a:b;
		System.out.println(c);
		System.out.println("=====logical operator===========");
		
		int p=51;
		if( p++ > 2 || p++ > 10 || p++ > 1) {}
		System.out.println(p);
		
		System.out.println("================");
		if(p>11); {
			System.out.println("p >11");
		}
		System.out.println("end");
	}
}
