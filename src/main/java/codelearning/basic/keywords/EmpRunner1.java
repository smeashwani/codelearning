package codelearning.basic.keywords;

public class EmpRunner1 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.m1();
		e.m2();
		
		EmpChild c = new EmpChild();
		c.m1();
		c.m2();
		c.m3();
	
		
		/*e = c;
		e.m1();
		e.m2();
		e.m3();*/
		if(! (e instanceof Emp)) {
			c = (EmpChild) e;
			c.m1();
			c.m2();
			c.m3();
		}
	}

}
