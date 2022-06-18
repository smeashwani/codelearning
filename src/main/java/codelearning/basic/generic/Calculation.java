package codelearning.basic.generic;

public class Calculation<T1,T2> {
	private T1 a;
	private T2 b;
	
	Calculation(T1 a, T2 b){
		this.a = a;
		this.b = b;
	}
	
	public int getSum(){
		Number a1 = (Number) (this.a);
		Number b1 = (Number) (this.b);
		return a1.intValue() + b1.intValue();
	}
	
	public <P1,P2> int add(P1 x,P2 y) {
		return 0;
	}
}
