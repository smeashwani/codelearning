package codelearning.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Coll_1_ArrayList {
	public static void main(String[] args) {
		List<String> lst = new ArrayList();
		lst.add("ducat3");
		lst.add("ducat1");
		lst.add("ducat2");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		
		List<Employee> lst1 = new ArrayList();
		lst1.add(new Employee("ducat1",12,5000));
		lst1.add(new Employee("ducat2",15,2000));
		lst1.add(new Employee("ducat1",5,9000));
		System.out.println(lst1);
		//Collections.sort(lst1);
		Collections.sort(lst1,new EmployeeSalaryComparator());
		System.out.println(lst1);

//		
//		List<String> lst1 = new ArrayList();
//		lst1.add("satya");
//		lst.retainAll(lst1);
//		System.out.println(lst);
//		lst.removeIf(ele -> {
//			return ele.contains("in");
//		});
		
//		lst.set(1,"mohini1");
	
//		lst.add(2);
//		lst.add(new Employee("test"));
		//System.out.println(lst.size());
		
		
//		
//		for(int i=0;i<lst.size();i++) {
//			Object object = lst.get(i);
//			System.out.println(object);
//		}
//		
//		for (String string : lst) {
//			System.out.println(string.concat("_ducat"));
//		}
//		
//		Iterator<String> iterator = lst.iterator();
//		while(iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
//		}
//		
//		Consumer<String> con  =  (obj) -> System.out.println(obj.concat("_ducat")); 
//		
//		lst.forEach(con);
//		
//		
//		lst.forEach( ele -> {
//			System.out.println(ele.concat("_ducat"));
//		});
		
	}
}


