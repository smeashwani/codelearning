package codelearning.basic.collect;
public class Employee implements Comparable{
	private int id;
	private String name;
	private int salary;
	
	@Override
	public int compareTo(Object o) {
		Employee obj = (Employee)o;
		if(this.id > obj.id) {
			return 1;
		}else {
			if(this.id == obj.id) {
				return this.salary > obj.salary? 1: -1;
			}else {
				return -1;
			}
		}
	}
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Employee.hashCode(): "+ id);
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Employee.equals()" + this.name);
		Employee other = (Employee)obj;
		return this.name.equals(other.name);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}