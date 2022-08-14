package codelearning.basic.objectmethod;
//POJO - Plain old java object
public class Employee {
	
	private String name;
	private int age;
	private int sal;
	
	public Employee(String name, int age, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return this.name == other.name && 
				this.age == other.age;
	}
	
	
	

}
