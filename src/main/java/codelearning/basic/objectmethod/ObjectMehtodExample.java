package codelearning.basic.objectmethod;

public class ObjectMehtodExample {
	public static void main(String[] args) {
//		Employee e1 = new Employee("ducat",22,22000);
//		Employee e2 = new Employee("ducat",22,22001);
//		System.out.println(e1 == e2);
//		System.out.println(e1.equals(e2));
		
//		String s = new String("welcome");
//		String s1 = new String("welcome");
//		System.out.println(s == s1);
//		System.out.println(s.equals(s1));
		
		String s="Welcome";
		String s1="Welcome";
		String s2 = new String("Welcome");
		System.out.println(s == s1);
		System.out.println(s.intern() == s);
		
		
		
	}
}
