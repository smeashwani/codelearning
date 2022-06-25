package codelearning.basic.oops;

public class Runner {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.age=18;
		e.salary=18000;
		e.name="Guest";
		System.out.println(e.age+ "-" + e.salary + e.name);
		
		Employee e1 = new Employee();
		e1.age=17;
		e1.salary=17000;
		e1.name="Guest1";
		System.out.println(e1.age+ "-" + e1.salary + e1.name);
		
		update(e1);
		System.out.println(e.age+ "-" + e.salary + e.name);
		System.out.println(e1.age+ "-" + e1.salary + e1.name);
	}

	private static void update(Employee e1) {
		e1.name="welcome";
		e1 =  new Employee();
		e1.age= 12;
		e1.salary=12000;
		
	}
}
