package codelearning.basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(22,22000,"Guest2");
		Employee e2 = new Employee(11,11000,"Guest1");
		Employee e3 = new Employee(44,44000,"Guest4");
		Employee e4 = new Employee(33,33000,"Guest3");
		
		ArrayList<Employee> l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(new Employee(22,55000,"Guest5"));
		System.out.println(l);
//		ArrayList<Employee> l1 = new ArrayList();
//		for (Employee employee : l) {
//			if(employee.age > 20) {
//				l1.add(employee);
//			}
//		}
//		System.out.println(l1);
//		List<Employee> l1 = l.stream()
//				.filter(e -> e.age > 20)
//				.collect(Collectors.toList());
//		System.out.println(l1);
		
		
//		ArrayList<String> l1 = new ArrayList();
//		for (Employee employee : l) {
//			if(employee.age > 20) {
//				l1.add(employee.name);
//			}
//		}
//		System.out.println(l1);
		
	
		
		Stream<String> map = l.parallelStream()
				.filter(e -> e.age > 20)
				.map(e-> e.name);
		List<String> collect = map.collect(Collectors.toList());
		
		
		System.out.println(collect);
		
		
	}
}
