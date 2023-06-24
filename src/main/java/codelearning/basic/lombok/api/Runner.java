package codelearning.basic.lombok.api;

import java.util.HashSet;

public class Runner {
	public static void main(String[] args) {
//		EmployeeToString e = new EmployeeToString();
//		e.setAge(27);
//		e.setName("Guest");
//		e.setPassword("pass");
//		
//		System.out.println(e);
		
		
//		EmployeeEquals e = new EmployeeEquals();
//		e.setAge(25);e.setName("Guest");e.setPassword("pass");
//		
//		EmployeeEquals e1 = new EmployeeEquals();
//		e1.setAge(25);e1.setName("Guest");e1.setPassword("pass");
//		
//		HashSet<EmployeeEquals> h = new HashSet();
//		h.add(e);
//		h.add(e1);
//		System.out.println(h.size());
		
		EmployeeConstructor e = new EmployeeConstructor();
		EmployeeConstructor e1 = new EmployeeConstructor("Name","password",25);
		
	}
}
