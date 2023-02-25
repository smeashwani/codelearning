package codelearning.basic.collection_batch1;

import java.util.IdentityHashMap;

public class MyHashMap {
	public static void main(String[] args) {
		//Map<String,String> h = new HashMap();
		//Map<String,String> h = new LinkedHashMap<>();
		
		
		
		  IdentityHashMap m=new IdentityHashMap();
			 //  Integer i1=10;
			 //  Integer i2=10;
			   Integer i1=210;
			   Integer i2=210;
			   m.put(i1,"pavan");
			   m.put(i2,"kalyan");
			   System.out.println(m);
		
//		Map<String,String> h = new TreeMap<>();
//		h.put("Three", "three");
//		h.put("One", "One");
//		h.put("Two", "two");
//		
//		System.out.println(h);
		
	}

}
