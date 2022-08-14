package codelearning.basic.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class TestJavaCollection5 {
	public static void main(String args[]) {
		 IdentityHashMap m=new IdentityHashMap();
		   Integer i1=new Integer(10);
		   Integer i2=new Integer(10);
		   m.put(i1,"pavan");
		   m.put(i2,"kalyan");
		   System.out.println(m);

	}
}
