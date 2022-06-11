package codelearning.basic.constructor;

public class Runner {
	public static void main(String[] args) {
//		Employee e = new Employee("Guest", 18);
//		System.out.println(e.name + " " +e.age);
//		
//		Employee e1 = new Employee("Guest1", 25);
//		System.out.println(e1.name + " " +e1.age);
//		
		Employee e2 = new Employee("",2);
		System.out.println(e2.name + " " +e2.age);
		e2.employee();
		System.out.println(e2.name + " " +e2.age);
		e2.check("ABC", 22);
		System.out.println(e2.name + " " +e2.age);	
		
		int a=10;
		int b=20;
		System.out.println("Result"+a+b);
		System.out.println(a+b+"Result");
		System.out.println(a+"Result"+b);
	}

}
