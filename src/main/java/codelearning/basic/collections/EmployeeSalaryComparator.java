package codelearning.basic.collections;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	
	public int compare(Employee first, Employee second) {
		return first.salary > second.salary ? 1 : -1;
	}

}
