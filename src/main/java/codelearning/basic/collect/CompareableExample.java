package codelearning.basic.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareableExample {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		// Creating arraylist
//		list.add("Ravi");// Adding object in arraylist
//		list.add("Vijay");
//		list.add("Ravi");
//		list.add("Ajay");
		list.add(new Employee(1,"Guest1",21_000));
		list.add(new Employee(5,"Guest5",22_000));
		list.add(new Employee(2,"Guest4",23_000));
		list.add(new Employee(2,"Guest2",24_000));
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.sort(list, (obj1 , obj2) -> {
//			Employee oobj1 = (Employee)obj1;
//			Employee oobj2 = (Employee)obj2;
//			return oobj1.getName().compareTo(oobj2.getName());
//		});
		//Collections.sort(list, Comparator.comparing(Employee::getName));
		Collections.sort(list, Comparator.comparing(Employee::getId));
		System.out.println(list);
	}

}
