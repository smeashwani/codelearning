package codelearning.basic.keywords;

public class Child extends Parent{

	int age;
	int salary;
	
	static 
	{
		System.out.println("child");
	}
	
//	Child(){
//		super(3);
//		name = "CHILD_ Guest";
//		age =15;
//		salary = 15_000;
//		System.out.println("Child.Child()");
//
//	}

	{
		System.out.println("child init...");
	}
}
