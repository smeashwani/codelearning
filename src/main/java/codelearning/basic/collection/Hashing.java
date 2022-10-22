package codelearning.basic.collection;

import java.util.HashSet;
import java.util.Set;

public class Hashing {
	public static void main(String[] args) {
		Set<Employee> set=new HashSet<Employee>();
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add(new Employee(21,21001,"Guest-4"));
		set.add(new Employee(23,23000,"Guest-1"));
		set.add(new Employee(21,24002,"Guest-2"));
		set.add(new Employee(22,22000,"Guest-3"));
		set.add(new Employee(21,24003,"Guest-2"));
		set.add(new Employee(21,24004,"Guest-2"));
		set.add(new Employee(21,24005,"Guest-2"));
		set.add(new Employee(21,24006,"Guest-2"));
		set.add(new Employee(21,24007,"Guest-2"));
		set.add(new Employee(21,24008,"Guest-2"));
		set.add(new Employee(21,24009,"Guest-2"));
		set.add(new Employee(21,240010,"Guest-2"));
		set.add(new Employee(21,240011,"Guest-2"));
		System.out.println(set);
		// since the element "Good" is present, therefore, the method remove() 
		// returns true 
		//System.out.println(set.remove("Good")); 
		
	}

}
