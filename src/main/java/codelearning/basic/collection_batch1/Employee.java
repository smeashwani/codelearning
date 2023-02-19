package codelearning.basic.collection_batch1;
public class Employee implements Comparable{
	int id;
	String name;
	double salary;
	public Employee() {
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("EQUALS....");
		Employee t  = (Employee)obj;
		return t.name ==  this.name;
	}
	
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		return id;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee another = (Employee)o;
		//return this.salary >= another.salary? 1:-1;
		int z = this.name.compareTo(another.name);
		if(z==0) {
			return this.salary >= another.salary? -1:1;
		}
		return z;
	}
	
	
}