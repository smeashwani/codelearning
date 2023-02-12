package codelearning.basic.keywords;

public class Simple {
	
	{
		System.out.println("init block");
	}
	int age;
	int salary;
	static String name;
	
	static 
	{
		name="Guest***";
		System.out.println("static block");
	}
	
	
	{
			age =10;
			salary = 15_000;
		System.out.println("init block....");
	}
}
