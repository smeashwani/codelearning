package codelearning.basic.statickeyword;

public class Sample {
	
	static 
	{
		System.out.println("welcome to ducat");
	}
	
	public static void main(String[] args) {
//System.out.println(Employee.companyName);
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
//		Employee e =null;
//		System.out.println(Employee.companyName);
//		System.out.println(e.companyName);
//		System.out.println(e.name + " "+e.age + " "+  e.salary+" " +e.companyName);
//		e.age=22;
//		e.name="Guest";
//		e.companyName = "Ducat";
//		System.out.println(e.name + " "+e.age + " "+  e.salary +" " +e.companyName);
//		
//		Employee e1 = new Employee();
//		System.out.println(e1.name + " "+e1.age + " "+  e1.salary+" " +e.companyName);
//		e1.salary=21000;
//		e1.name="Guest1";
//		e.companyName = "NIIT";
//		System.out.println(e1.name + " "+e1.age + " "+  e1.salary+" " +e.companyName);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.age=12;
		e2.salary=5000;
		e3.age=22;
		e3.salary=50000;
		e1.validate();
		e2.validate();
		e3.validate();
	}
}

