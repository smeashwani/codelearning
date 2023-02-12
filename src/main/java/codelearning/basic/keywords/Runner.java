package codelearning.basic.keywords;

public class Runner {
	
	static 
	{
		System.out.println("....init block");
	}
	
	public static void main(String[] args) {
		
		Simple obj =null;
		Simple.name ="Guest111";
		obj = new Simple();
		obj.age=10;
		obj.salary=15_000;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		
		System.out.println("***********");
		Simple obj1 =  new Simple();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		
		
		
		
		
		
		
//		Simple obj = new Simple();
//		obj.name="ducat";
//		obj.age=15;
//		obj.salary=15_000;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
//		System.out.println(obj.salary);
//		
//		Simple obj1 = new Simple();
//		obj1.name="ducat1";
//		obj1.age=115;
//		obj1.salary=115_000;
//		
//		System.out.println(obj1.name);
//		System.out.println(obj1.age);
//		System.out.println(obj1.salary);
		
	}
}
