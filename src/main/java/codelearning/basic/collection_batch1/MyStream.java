package codelearning.basic.collection_batch1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList();
		lst.add(1);
		lst.add(10);
		lst.add(12);
		lst.add(5);
		lst.add(7);
		
		System.out.println(lst);
		
		/*List<Integer> res = new ArrayList();
		 * synchronized (lst) {
			for (Integer item : lst) {
				if(item%2 == 0) res.add(item*2);
			}	
		}*/
		Stream<Integer> stream = lst.parallelStream();
		
		
		lst.add(16);
		lst.add(17);
		lst.add(18);
		
		IntStream mapToInt = stream.filter((item) -> item%2 == 0)
				.mapToInt(item -> item.intValue());
		
		lst.add(19);
		lst.add(20);
		lst.add(21);
		int sum = mapToInt.sum();
		System.out.println(sum);
		
		
		
	
		
		
	}
}
