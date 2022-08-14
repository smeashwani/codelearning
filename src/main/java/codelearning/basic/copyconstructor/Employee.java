package codelearning.basic.copyconstructor;

public class Employee implements Cloneable {
	String name;
	int age;
	int salary;
	Address add;
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", add=" + add + "]";
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		 Employee cl = (Employee) super.clone();
		 cl.add = (Address) cl.add.clone();
		 return cl;
	}
	
}
