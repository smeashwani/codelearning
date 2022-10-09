package codelearning.basic.collection;

import java.util.Set;
import java.util.TreeSet;

public class Hashing {
	public static void main(String[] args) {
		Set<Employee> set=new TreeSet<Employee>(new EmployeeNameComparator());
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add(new Employee(21,21000,"Guest-4"));
		set.add(new Employee(23,23000,"Guest-1"));
		set.add(new Employee(21,24000,"Guest-2"));
		set.add(new Employee(22,22000,"Guest-3"));
		System.out.println(set);
		// since the element "Good" is present, therefore, the method remove() 
		// returns true 
		//System.out.println(set.remove("Good")); 
		
	}

}
