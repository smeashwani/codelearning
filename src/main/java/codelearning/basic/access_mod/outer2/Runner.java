package codelearning.basic.access_mod.outer2;

public class Runner extends Employee {
	public void check() {
		Employee e = new Employee();
		e.defaultMethod();
		e.protectedMethod();
		e.publicMethod();
	}
	public void check2() {
		defaultMethod();
		protectedMethod();
		publicMethod();
		
	}
}
