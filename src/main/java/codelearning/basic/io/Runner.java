package codelearning.basic.io;

public class Runner extends SuperRunner
{
	
	public static void main(String[] args) {
		System.out.println("Runner.main()");
		test();
		System.out.println("Runner.main()-end");
	}

	private static void test() {
		try {
			System.out.println("Start");
			int a=10/0;
			System.out.println("END");
		}catch(Exception e) {
			System.err.println("Exception "+e);
			//e.printStackTrace();
		}
	}
}
