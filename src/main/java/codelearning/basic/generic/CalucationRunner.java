package codelearning.basic.generic;

import java.util.ArrayList;
import java.util.List;

public class CalucationRunner {
	public static void main(String[] args) {
	/*	NonGenericCalculation obj = new NonGenericCalculation(2,3);
		System.out.println(obj.getSum());
	*/	
		Calculation<Integer> obj  = new Calculation(2,3);
		System.out.println(obj.getSum());
//		
		Calculation<String> obj1  = new Calculation(4.8d,3.2f);
		System.out.println(obj1.getSum());
//		
		obj1.<Integer, Long>add(2,3123123l);
		
	}

}
