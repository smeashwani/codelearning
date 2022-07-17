package codelearning.basic.inheritence;

public class RunnerSuper {
	
	public static void main(String[] args) {

		
		EmployeeDetails e = new EmployeeDetails();
		e.add();
	}
}

class Employee{
	final int aa;
	
	Employee(int a){
		aa=10;

		System.out.println("constr... parent- 1");
	}
	
	public void add() {
		System.out.println("Employee.add()");
	}
	
}
class EmployeeDetails extends Employee{
	EmployeeDetails(){
		super(10);
		System.out.println("constr... child");
	}
	public void add() {
		System.out.println("EmployeeDetails.add()");
	}
}
