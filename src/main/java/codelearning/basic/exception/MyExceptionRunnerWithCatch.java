package codelearning.basic.exception;

public class MyExceptionRunnerWithCatch {
	public static void main(String[] args) {
		System.out.println("start prog - property purchase");
		int arr[] = {10,12};
		int a=0;
		try {
			System.out.println("1");
		 a=arr[0]/0;
		 System.out.println("2");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		finally {
			a = 10/1;
		}
		System.out.println(a);
		System.out.println("Property Buy successfully");
	}
}
