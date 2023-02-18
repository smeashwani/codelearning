package codelearning.basic.collection_batch1;

import java.util.HashSet;

public class MySet {
	
	public static void main(String[] args) {
//		HashSet<Employee> h = new HashSet();
//		h.add(new Employee(12,"Guest",11_000));
//		h.add(new Employee(12,"Guest",12_000));
//		h.add(new Employee(12,"Guest1",13_000));
//		
//		System.out.println(h);
		HashSet<String> h = new HashSet();
		for(int i=0;i<15;i++) {
			h.add(""+i);
		}
		
		System.out.println(h);
		
	}

}
