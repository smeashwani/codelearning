package codelearning.basic.collect;

import java.util.IdentityHashMap;

public class IdentityHashMap1 {
	public static void main(String[] args) {
		 IdentityHashMap m=new IdentityHashMap();
		   Integer i1=10;
		   Integer i2=10;
//		   Integer i1=210;
//		   Integer i2=210;
		   m.put(i1,"pavan");
		   m.put(i2,"kalyan");
		   System.out.println(m);

	}
}
