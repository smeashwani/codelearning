package codelearning.basic.functionalCode;

public class Example1 {
 public static void main(String[] args) {
	 Cal add = new Cal() {
		 @Override
		public int check(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	 };
	 
	 Cal sub = new Cal() {
		 @Override
		public int check(int a, int b) {
			// TODO Auto-generated method stub
			return a-b;
		}
	 };
	 Cal div = new Cal() {
		 @Override
		public int check(int a, int b) {
			// TODO Auto-generated method stub
			return a/b;
		}
	 };
	 
	 
	/* Cal add = (a, b) -> a+b;
	 Cal sub = (a, b) -> a-b;
	 Cal div  = (a, b) -> a/b;*/
	 
	 System.out.println(add.check(2, 3));
	 System.out.println(sub.check(2, 3));
	 System.out.println(div.check(2, 3));
 }
}

interface Cal{
	int check(int a, int b);
}

