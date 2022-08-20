package codelearning.basic.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJavaCollection5 {
	public static void main(String args[]) {
		List<Employee> stuJava =  new ArrayList();
		stuJava.add(new Employee("A",18,22000));
		stuJava.add(new Employee("B",22,22000));
		stuJava.add(new Employee("c",21,22000));
		Stream<Employee> filter = stuJava.stream().filter(emp -> emp.age > 20);
		
		stuJava.add(new Employee("d",22,22000));
		stuJava.add(new Employee("e",21,22000));
		
		List<Employee> collect = filter.collect(Collectors.toList());
		System.out.println(collect);
//		List<String> collect = stuJava.stream().filter(emp -> emp.age > 20)
//				.map(emp ->  emp.getName()).collect(Collectors.toList());
//		System.out.println(collect);
//		List<String> stuNet =  new ArrayList();
//		stuJava.add("11");
//		stuJava.add("22");
//		stuJava.add("33");
//		
//		List<List<String>> stuLst = new ArrayList();
//		stuLst.add(stuJava);
//		stuLst.add(stuJava);
//		

		
	}
}
