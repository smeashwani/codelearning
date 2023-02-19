package codelearning.basic.collection_batch1;

import java.util.Comparator;

public class MyAgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee first =  (Employee)o1;
		Employee sec =  (Employee)o2;
		return first.id >= sec.id ? 1: -1 ;
	}

}
