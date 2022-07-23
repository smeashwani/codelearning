package codelearning.basic.lambda;

public class Runner {
	static int x=1000;
	public static void main(String[] args) {
		int z=100;
//		Calc sum = new Calc() {
//			@Override
//			public int operation(int a, int b) {
//			
//				return a+b;
//			}
//		};
//		
//		Calc sub = new Calc() {
//			@Override
//			public int operation(int a, int b) {
//			
//				return a-b;
//			}
//		};
		
//		Calc max = new Calc() {
//		@Override
//		public int operation(int a, int b) {
//		
//			return  Math.max(a,b);
//		}
//	};
		Calc sum = (a,b) -> a+b;
		Calc sub = (a,b) -> a-b;
		Calc max = (a,b) ->{
			a =a +z+ x;
			
			x++;
			return Math.max(b, a); };
		Calc min = Math::min;
		
		System.out.println(sum.operation(2, 3));
		System.out.println(sub.operation(2, 3));
		System.out.println(max.operation(2, 3));
		System.out.println(min.operation(2, 3));
		
		
		StringCalc  strLowercase = s -> s.toLowerCase();
		StringCalc  strUppercase = s -> s.toUpperCase();
		
		System.out.println(strLowercase.check("WELcome"));
		//z++;
		
	}
		
}

interface StringCalc{
	String check(String str);	
}

interface Calc{
	int operation(int a, int b);
}

