package codelearning.basic.constructor;

public class Employee {
	String name;
	int age;
	Employee(){}
	Employee(String n, int a){
		System.out.println("Cons....");
		name = n;
		age =a;
	}
	
	
	{
		System.out.println("Init....");
		age= 18;
	}
	
	void employee(){
		System.out.println("method....");
		name="Guest1";
	}
	
	void check(String name, int age) {
		check1(name, age);
	}
	
	void check1(String p, int a) {
		
	}
	

}
