package codelearning.basic.advinterface;

public class Running {
	public static void main(String[] args) {
		MyInterface obj = new Student();
		MyInterface.print();
		MyInterface.print1();
		obj.display();
		obj.display1();
		System.out.println(obj.getName());
	}
}
