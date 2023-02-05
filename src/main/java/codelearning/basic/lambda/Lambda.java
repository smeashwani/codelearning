package codelearning.basic.lambda;

public class Lambda {
	
	public static void main(String[] args) {
		Calc1 cal = new Calc1() {
			@Override
			public int add(int a, int b) {
				System.out.println("Adding.....");
				return 100;
			}
		};
		cal.add(2,3);
		
		
		Calc1 cal1 = (a, b) -> 100;
		cal1.add(2, 3);
	}

} 
interface Calc1{
	int add(int a, int b);
}

class mycalc implements Calc1{

	@Override
	public int add(int a, int b) {
		System.out.println("Adding.....");
		return 10;
	}
	
}


