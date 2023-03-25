package codelearning.basic.commandLine;

public class CopyConstructor implements Cloneable {
	
	String name;
	int age;
	int salary;
	
	
	public CopyConstructor(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public CopyConstructor() {
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

/*	CopyConstructor(CopyConstructor other){
		this.name = other.name;
		this.age = other.age;
		this.salary = other.salary;
	}*/

	@Override
	public String toString() {
		return "CopyConstructor [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
