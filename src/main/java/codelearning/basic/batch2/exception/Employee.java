package codelearning.basic.batch2.exception;

public class Employee {
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.age ==  this.age;
	}


}
