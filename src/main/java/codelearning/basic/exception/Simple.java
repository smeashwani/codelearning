package codelearning.basic.exception;

public class Simple {

	public int calc(int a, int b) {
		if (b == 0) {
			MyException ex = new MyException("MyException");
			System.out.println("Generate exception");
			throw ex;
		}
		return a / b;
	}

}

