package codelearning.basic.collection_batch1;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Employee e1 = new Employee(12,"Guest",11_000);
		Employee e2 = new Employee(12,"Guest",12_000);
		Employee e3 = new Employee(12,"Guest1",13_000);
		Map<Employee,String> h = new HashMap();
		
		h.put(e1, "One");
		h.put(e2, "two");
		h.put(e3, "One One");
		System.out.println(h);
		
	}

}
