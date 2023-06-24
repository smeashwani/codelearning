package codelearning.basic.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		Employee e1 = new Employee(22,22000,"Guest2");
		Employee e2 = new Employee(11,11000,"Guest1");
		Employee e3 = new Employee(44,44000,"Guest4");
		
		List<Employee> l = List.of(e1,e2,e3);
//		List<Employee> list = l.stream().filter(item -> item.age > 20).toList();
		List<String> list = l.stream()
				.filter(item -> item.age > 20)
				.map(item -> item.name)
				.toList();
		list.forEach(System.out::println);
		
				
		
	}
}
