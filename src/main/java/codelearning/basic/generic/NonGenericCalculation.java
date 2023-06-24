package codelearning.basic.generic;
public class NonGenericCalculation {
	private Integer a;
	private Integer b;
	
	NonGenericCalculation(Integer a, Integer b){
		this.a = a;
		this.b = b;
	}
	
	public int getSum(){
		Number a1 = (Number) (this.a);
		Number b1 = (Number) (this.b);
		return a1.intValue() + b1.intValue();
	}
}