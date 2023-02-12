package codelearning.basic.collection_batch1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList(20);
		for(int i=0;i<=20;i++) {
			l.add(i);
		}
		
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			if(value %2 ==0) {
				System.out.println(value);
			}
		}
		
		
		
//		for(int i =0;i<l.size();i++) {
//			Object obj = l.get(i);
//			if(obj instanceof String) {
//				int a = Integer.parseInt((String)obj);
//				System.out.println(++a);
//			}
//			if(obj instanceof Integer) {
//				int v = ((Integer)obj).intValue();
//				System.out.println(++v);
//			}
//		}
		
		
	}

}


