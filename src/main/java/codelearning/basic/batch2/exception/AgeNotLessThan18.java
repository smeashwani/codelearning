package codelearning.basic.batch2.exception;

//public class AgeNotLessThan18 extends RuntimeException 
public class AgeNotLessThan18 extends Exception
{
	public AgeNotLessThan18() {
		super();
	}
	
	public AgeNotLessThan18(String str) {
		super(str);
	}
	
}
