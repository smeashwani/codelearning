package codelearning.basic.string;

public class EmployeeImmutable {
	
	private String name;
	private int age;
	
	public EmployeeImmutable(String name, int age) {
		this.name= name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeImmutable [name=" + name + ", age=" + age + "]";
	}

	@Deprecated
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destructor calling:"+this.name);
	}

}
