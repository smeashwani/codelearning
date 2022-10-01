package codelearning.basic.collection;

public class Employee {
	int age;
	int salary;
	String name;
	
	
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		return true;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return this.age;
	}
	
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
