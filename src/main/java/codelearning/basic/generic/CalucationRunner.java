package codelearning.basic.generic;

public class CalucationRunner {
	public static void main(String[] args) {
		Calculation<Integer, Integer> obj  = new Calculation<Integer, Integer>(2,3);
		System.out.println(obj.getSum());
		
		Calculation<Double, String> obj1  = new Calculation(4.8d,3.2d);
		System.out.println(obj1.getSum());
		
		obj1.<Integer, Long>add(2,3123123l);
	}

}
