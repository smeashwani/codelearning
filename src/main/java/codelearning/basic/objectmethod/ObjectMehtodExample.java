package codelearning.basic.objectmethod;

public class ObjectMehtodExample {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("ducat");
		e.setAge(18);
		e.setSal(18000);
		
		Employee e1 = new Employee();
		e1.setName("ducat");
		e1.setAge(18);
		e1.setSal(18000);
		System.out.println(e1);
		
		System.out.println(e.equals(e1));
	}
}
