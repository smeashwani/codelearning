package codelearning.basic.reflection;

//@MyAnnotation(value=10)

public class Employee {
	public String companyName;
	static public String companyName1;
	private String name;
	private int age;
	private int salary;
	
	private void test() {
		System.out.println("welcome to ducat");
	}
	
	public Employee() {
		System.out.println("const...");
	}
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	
	

}
