package codelearning.basic.collect;

import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(1,"Guest1",21_000));
		set.add(new Employee(5,"Guest5",22_000));
		set.add(new Employee(2,"Guest4",23_000));
		set.add(new Employee(2,"Guest2",24_000));
		System.out.println(set);
		
	}

}
