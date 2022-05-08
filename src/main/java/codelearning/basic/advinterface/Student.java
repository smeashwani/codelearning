package codelearning.basic.advinterface;

public class Student implements MyInterface {

	@Override
	public String getName() {
		return "Student";
	}
	
	void print() {
		System.out.println("welcome1");
	}
	
	public void display() {
		MyInterface.super.display();
		System.out.println("display...");
	}

}
