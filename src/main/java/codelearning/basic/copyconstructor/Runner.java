package codelearning.basic.copyconstructor;

public class Runner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("ducat", 22, 22000);
		e.add = new Address();
		e.add.street = "NOIDA";
		System.out.println(e);
		Employee e1 = (Employee) e.clone();
		e1.name ="welcome";
		e1.add.street = "INDIA";
		System.out.println(e1);
		System.out.println(e);
	}
}
