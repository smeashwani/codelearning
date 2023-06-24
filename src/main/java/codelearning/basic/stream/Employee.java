package codelearning.basic.stream;

public class Employee {
	
	int age;
	int salary;
	String name;
	
	public Employee(){}
	
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age +  "]";
	}
}
