package codelearning.basic.inheritence;

public interface Contract1 {
	int PI=10;
	void add(int a, int b);
	static void calculation() {
		System.out.println("Contract.calculation()");
	}
	default void defaultMethod() {
		System.out.println("Contract1.defaultMethod()");
	}
}

interface Contract2 {
	int PI=10;
	void add(int a, int b);
	default void defaultMethod() {
		System.out.println("Contract2.defaultMethod()");
	}
}

interface Contract extends Contract1, Contract2{
	default void defaultMethod() {
		Contract1.super.defaultMethod();
		
	}
}

class ContractImpl implements Contract1, Contract2{

	@Override
	public void add(int a, int b) {
		
		
	}
	
	public void defaultMethod() {
		Contract1.super.defaultMethod();
		System.out.println("Contract1.defaultMethod()");
	}
	
}
