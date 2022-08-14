package codelearning.basic.string;

public class Runner {
	public static void main(String[] args) {
		System.out.println("START");
		EmployeeImmutable obj = new EmployeeImmutable("Guest",22);
		obj.getName();
		for(int i=0;i<100000000;i++)
			obj = new EmployeeImmutable("Guest"+i,22);
		//Runtime.runFinalizersOnExit(true);
		System.out.println("END");
	}
}
