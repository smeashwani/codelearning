package codelearning.basic.copyconstructor;

public class Address implements Cloneable {
	String street;

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
