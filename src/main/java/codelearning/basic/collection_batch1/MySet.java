package codelearning.basic.collection_batch1;

import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	public static void main(String[] args) {
		Set<Employee> h = new TreeSet(new MyAgeComparator());
		h.add(new Employee(14,"Guest1",13_000));
		h.add(new Employee(16,"Guest",14_000));
		h.add(new Employee(15,"Guest",12_000));
		
//		
//		System.out.println(h);
//		Set<Integer> h = new TreeSet();
//		h.add(2);
//		h.add(0);
//		h.add(1);
//		h.add(12);
		
		
		System.out.println(h);
		
	}
}
