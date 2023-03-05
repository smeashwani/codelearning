package codelearning.basic.collection_batch1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyList {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList(20);
		for(int i=0;i<=20;i++) {
			l.add(i);
		}
		
		l.removeIf((a) -> a > 10 );
		l.forEach((a) ->  System.out.println(a));
		
//		l = Collections.unmodifiableList(l);
//		System.out.println(l.size());
//		validate(l);
//		System.out.println(l.size());
		/*Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			if(value %2 ==0) {
				System.out.println(value);
			}
		}
		
*/		
		
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

	private static void validate(List<Integer> l) {
		l.add(100);
		l.add(200);
	}

}


