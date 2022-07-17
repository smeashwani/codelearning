package codelearning.basic.access_mod.outer2;

public class RunnerSingleton {
	public static void main(String[] args) {

		SingletonClass obj = SingletonClass.getInstance("First");
		System.out.println(obj);
		SingletonClass obj1 = SingletonClass.getInstance("First");
		System.out.println(obj1);
		System.out.println(obj == obj1);
	}
}
