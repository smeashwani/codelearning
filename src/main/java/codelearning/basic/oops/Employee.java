package codelearning.basic.oops;

public class Employee {
	{
		age =10;
		salary=20000;
		System.out.println("init block");
	}
	static int count=0;
	int age;
	int salary;
	String name;
	static String companyName;

	static
	{
		companyName="Guest";
		System.out.println("static init bloc");
	}
	{
		age =18;
		salary=18000;
		System.out.println("init block2");
	}
	Employee(){
		System.out.println("cons default");
		count++;
		if(count == 6) {
			int a=10/0;
		}
	}
}
  