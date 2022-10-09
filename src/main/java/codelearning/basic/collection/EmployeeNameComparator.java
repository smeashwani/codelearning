package codelearning.basic.collection;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee first, Employee second) {
		if(first.name.compareTo(second.name) >= 1) return 1;
		if(first.name.compareTo(second.name) <=  1) return -1;
		return 0;
	}
}
