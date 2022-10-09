package codelearning.basic.inheritence;

public class Runner {
	
	public static void main(String[] args) {
		ContractImpl obj = new ContractImpl();
		obj.defaultMethod();
//		Parent p = new Parent();
//		p.add(0, 0, 0);
//		Child c = new Child();
//		c.sub(0, 0);
//		c.add(2.0f,2.0f);
	}

}

class Parent{
	void add(int a, int b) {
		System.out.println("welcome-2");
	}
	void add(int a, int b, int c) {
		System.out.println("welcome - 3");
	}
	void add() {
		System.out.println("welcome - 3");
	}
	void add(float a, float b) {
		System.out.println("welcome-2");
	}
	
}

class Child extends Parent{
	void sub(int a, int b) {
		System.out.println("sub-2");
	}
	//@Override
	void add(float a, float b, int a1) {
		System.out.println("child-2");
	}
}


