package codelearning.basic.collection_batch1;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {
	public static void main(String[] args) {
		Employee e3 = new Employee(11,"Guest1",13_000);
		Employee e1 = new Employee(12,"Guest",11_000);
		Employee e2 = new Employee(13,"Guest",12_000);
	
		Map<Employee,String> h = new TreeMap();
		h.put(e3, "One One");
		h.put(e1, "One");
		h.put(e2, "two");
		
		System.out.println(h);
		
	}

}
