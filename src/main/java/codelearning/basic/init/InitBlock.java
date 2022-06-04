package codelearning.basic.init;

public class InitBlock {
	
	static int a=10;
	
	public static void main(String[] args) {
	
		a=100;
		
	}
}
class Employee{
	int count;
	static int globalCount;

	
	{
		
		System.out.println("init block");
	
	}
	
	static {
		System.out.println("static init block");
	}
}
