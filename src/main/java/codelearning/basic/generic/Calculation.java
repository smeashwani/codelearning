package codelearning.basic.generic;

public class Calculation<T1> {
	private T1 a;
	private T1 b;
	
	Calculation(T1 a, T1 b){
		this.a = a;
		this.b = b;
	}
	
	public int getSum(){
		Number a1 = (Number) (this.a);
		Number b1 = (Number) (this.b);
		return a1.intValue() + b1.intValue();
	}
}
