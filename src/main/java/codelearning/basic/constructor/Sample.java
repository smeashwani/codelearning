package codelearning.basic.constructor;

public class Sample {
	int age;
	int sal;
	String name;
	
	{
		age=18;
		System.out.println("Sample.INIT...1()");
	}
	
	{
		sal=18_000;
		System.out.println("Sample.INIT...2()");
	}
	
	Sample(){
		System.out.println("Sample.Cons...1()");
	}
	
	Sample(String name){
		this();
		this.name=name;
	}
	
}
