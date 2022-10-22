package codelearning.basic.innerclass;

public class Annoumous {
	
	void check() {
		Employee e = new Employee(){
			public void check1() {
				
			}
			public void check2() {}
		};
	}
	
	
}

interface Employee{
	void check1();
	void check2();
}

