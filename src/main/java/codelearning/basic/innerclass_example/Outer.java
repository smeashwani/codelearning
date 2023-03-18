package codelearning.basic.innerclass_example;

public class Outer {
	
	static String name1 = "guest";
	int salary = 5000;
	
	void nonstaticmethod() {
		salary=100;
		name1 ="test";
	}
	
	static class Inner{
		
		String name2 ="Inner guest";
		static void test() {
			//System.out.println(salary);
			System.out.println(name1);
		}
		void test1() {
			//System.out.println(salary);
			System.out.println(name1);
		}
		
		public static void main(String[] args) {
			System.out.println("welcome");
		}
	}
	
	Inner obj = new Inner();
	String obj1 = new String("asdf");

}
