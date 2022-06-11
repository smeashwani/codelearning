package codelearning.basic.statickeyword;

public class Employee {
	int age;
	int salary;
	String name;
	static String companyName;
	public static void main1(String[] args) {
		System.out.println("welcome ");
	}
	public void validate(){
		companyName="asdf";
		if(age < 18) {
			System.out.println("Not a valid user");
		}
		if(salary < 15000) {
			System.out.println("Not a valid user");
		}
	}
	
	
	{
		age=18;
		salary=15000;
		name = "Guest";
		companyName = "Training";
		System.out.println("init block...1");
	}
	
	static 
	{
		System.out.println("static 1");
		companyName = "Learning";
	}
	
	{
		age=18;
		salary=15000;
		name = "Guest";
		companyName = "Training";
		System.out.println("init block...2");
	}
	
	
	{
		age=18;
		salary=15000;
		name = "Guest";
		companyName = "Training";
		System.out.println("init block...3");
	}
	
	static 
	{
		companyName = "Learning";
		System.out.println("static 2");
	}
	
}
