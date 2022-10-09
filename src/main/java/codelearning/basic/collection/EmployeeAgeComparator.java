package codelearning.basic.collection;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee first, Employee second) {
		if(first.age >=  second.age) return 1;
		if(first.age <=  second.age) return -1;
		return 0;
	}
}
