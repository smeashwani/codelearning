package codelearning.basic.innerclass_example;

public class Local {
	
	int a=10;
	static int b=20;
	
	void check() {
		int a;
		parent obj = new parent() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
			
		
		
	}
	
	void check1() {
		parent obj = new parent() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
			
		
		
	}
}

interface parent{
	void test() ;
}

class child implements parent{
	public void test() {
		System.out.println("welcome 1");
	}
}
