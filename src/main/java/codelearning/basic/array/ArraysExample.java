package codelearning.basic.array;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String... args) {
		final int a[] = { 10, 20, 30 };
		a[0] = 100 ;
		System.out.println(Arrays.toString(a));
		
		
		

		final Example e = new Example();
		e.t =10;
		
		//e = new Example();
		
		// System.out.println(e.add(10));
	}

}

class Example {
	
	int t;
	int add(int... ar) {
		int sum = 0;
		// for (int i = 0; i < ar.length; i++) {
		// sum = sum + ar[i];
		// }
		// for (int i : ar) {
		// sum = sum + i;
		// }

		return sum;
	}
}