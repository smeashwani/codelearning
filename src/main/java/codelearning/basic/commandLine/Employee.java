package codelearning.basic.commandLine;

public class Employee {
	String name;
	int age;
	int salary;
	
	private Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	private static Employee obj;
	
	public static Employee getEmployee() {
		if(obj == null) {
			obj = new Employee("guest",22,22_000);
		}
		return obj;
	}
}


