package codelearning.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Example {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(21,21000,"Guest-4"));
		l.add(new Employee(23,23000,"Guest-1"));
		l.add(new Employee(21,24000,"Guest-2"));
		l.add(new Employee(22,22000,"Guest-3"));
		
//		class MyConsumer implements Consumer<Employee>{
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t.age);
//			}
//		}

		//l.forEach(new MyConsumer());
		
		
		l.removeIf(t -> (t.age == 21));
		
		l.forEach(t -> System.out.println(t));
		
//		Collections.sort(l,new Comparator<Employee>() {
//			@Override
//			public int compare(Employee first, Employee second) {
//				if(first.name.compareTo(second.name) >= 1) return 1;
//				if(first.name.compareTo(second.name) <=  1) return -1;
//				return 0;
//			}
//		});
		
//		Collections.sort(l,(Employee first, Employee second) -> {
//				if(first.name.compareTo(second.name) >= 1) return 1;
//				if(first.name.compareTo(second.name) <=  1) return -1;
//				return 0;
//			});
		
		System.out.println(l);
		
//		Enumeration<Employee> elements = l.elements();
//		while(elements.hasMoreElements()) {
//			Employee nextElement = elements.nextElement();
//			System.out.println(nextElement);
//		}
		
//		
//		ListIterator<Employee> listIterator = l.listIterator();
//		while(listIterator.hasNext()) {
//			Employee next = listIterator.next();
//			System.out.println(next);
//		}
//		while(listIterator.hasPrevious()) {
//			Employee next = listIterator.previous();
//			System.out.println(next);
//		}
//		Iterator<Employee> iterator = l.iterator();
//		while(iterator.hasNext()) {
//			Employee next = iterator.next();
//			System.out.println(next);
//		}
		
//		for (Employee employee : l) {
//			System.out.println(employee);
//		}
//		Collections.sort(l);
//		System.out.println("After sorting..........");
//		for (Employee employee : l) {
//			System.out.println(employee);
//		}
		
		
		//System.out.println(l.size());
		//System.out.println(l.size());
		//System.out.println(l.contains(new Employee(22,22000,"Guest")));
		//ArrayList<String> l = new ArrayList<String>();
//		HashSet<String> l = new HashSet<String>();
//		l.add("three");
//		l.add("one");
//		l.add("two");
		
		//System.out.println(l);
	}
}
