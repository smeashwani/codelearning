package codelearning.basic.commandLine;

public class Runner {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CopyConstructor obj1 = new CopyConstructor("Guest",22,22_000);
		obj1.salary =25_000;
		
		CopyConstructor obj2 =  (CopyConstructor) obj1.clone();
		obj1.name ="Guest1";
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		/*System.out.println(Employee.getEmployee());
		System.out.println(Employee.getEmployee());
		System.out.println(Employee.getEmployee());
		System.out.println(Employee.getEmployee());*/
		
	}
}
