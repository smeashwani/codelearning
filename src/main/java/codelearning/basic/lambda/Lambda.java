package codelearning.basic.lambda;

public class Lambda {
	
	public static void main(String[] args) {
		
		Calc1 cal1 = String::new;
		cal1.add(null, 2,3);
		
		
	}
	
} 
interface Calc1{
	void add(int[] codePoints, int offset, int count);
}