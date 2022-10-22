package codelearning.basic.access_mod.outer1;

import codelearning.basic.access_mod.outer2.Employee;
import static java.lang.Math.*;
public class Runner extends Employee  {
	
	public void check() {
		Employee e = new Employee();
		//e.defaultMethod();
		//e.protectedMethod();
		e.publicMethod();
	}
	
	public void check2() {
		//defaultMethod();
		protectedMethod();
		publicMethod();
		max(20, 21);
	}
}
