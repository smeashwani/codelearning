package codelearning.basic.constructor;

public class SampleRunner {

	int a=10;
	
	public static void main(String[] args) {
		System.out.println("START");
		Sample s = new Sample("Guest");
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sal);
		System.out.println("END");
	}
}
