package codelearning.basic.objectmethod;
//POJO - Plain old java object
public class Employee {
	
	private String name;
	private int age;
	private int sal;
	
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee="+ name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.age==this.age && temp.sal ==  this.sal;
	}

}
