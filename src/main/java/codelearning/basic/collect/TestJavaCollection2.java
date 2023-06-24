package codelearning.basic.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class TestJavaCollection2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// changing the element
		list.set(1, "Dates");
		// Traversing list through for-each loop
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		 //Sorting the list 
		Collections.sort(list); 
		System.out.println("-------------");
		System.out.println(list);
		//Removing specific element from arraylist 
		list.remove("Vijay");
		//Removing element on the basis of specific position 
		list.remove(0); 
		//Adding new elements to arraylist 
		ArrayList<String> al2=new ArrayList<String>(); 
		al2.add("Ravi"); 
		al2.add("Hanumat"); 
		
		list.addAll(al2); 
		//Removing all the new elements from arraylist 
		list.removeAll(al2); 
		//Removing elements on the basis of specified condition 
		list.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
		list.removeIf(new Predicate<String>() {
			public boolean test(String t) {
				return t.equals("Ajay");
			};
		});
		list.removeIf(  t -> 
			t.equals("Ajay")
		);
		//Removing all the elements available in the list 
		list.clear(); 
		
		list.retainAll(al2);  // remove uncommon
		list.isEmpty(); // check empty

	}
}
