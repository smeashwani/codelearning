package codelearning.basic.innerclass;

public class Runner1 {
	public static void main(String[] args) {
		System.out.println("outer");
	}
	
	static class Inner{
		public static void main(String[] args) {
			System.out.println("inner");		
		}
	}

}
