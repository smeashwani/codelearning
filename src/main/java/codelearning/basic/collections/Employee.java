package codelearning.basic.collections;
public class Employee implements Comparable{
	String name;
	int age;
	int salary;
	public Employee(String n, int age, int salary) {
		name = n;
		this.age= age;
		this.salary= salary;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "#" +age+"]";
	}

	@Override
	public int compareTo(Object o) {
		Employee other  = (Employee)o;
		if(this.name.equals(other.name)){
			return this.age > other.age ? 1: -1 ;
		}else {
			return this.name.compareTo(other.name);
		}
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode: "+this.age);
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee)obj;
		System.out.println("Equals: "+this.name + " : "+this.age);
		return  this.age == other.age && this.salary ==  other.salary;
	}
	
	
	
}