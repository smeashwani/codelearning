package codelearning.basic.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("red","green","blue");
		int count=0;
		for (int i = 0; i < asList.size(); i++) {
			String string = asList.get(i);
			if(string.contains("r")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		//Stream<String> stream = Stream.of("red","green","blue");
		Stream<String> stream = asList.stream();
		List<String> collect = stream.filter(e -> e.contains("r") ).collect(Collectors.toList());
		System.out.println(collect.size());
		
		Stream<String> stream1 = asList.stream();
		int cou= (int) stream1.filter(e -> e.contains("r") ).count();
		System.out.println(cou);
		
	}
}
