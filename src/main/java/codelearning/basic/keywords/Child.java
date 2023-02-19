package codelearning.basic.keywords;

public class Child extends Parent{

	static public void add(int a, int b) { 
		System.out.println("Child.add()");
	}
	
	@Override
	public void sub(int a, int b) { 
		System.out.println("Child.sub()");
	}
	
	public void mul(int a, int b) { 
		System.out.println("Child.sub()");
	}

}
