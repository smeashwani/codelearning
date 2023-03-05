package codelearning.basic.collection_batch1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent {
	public static void main(String[] args) {
		List<String> myList = new CopyOnWriteArrayList();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
	
			if (value.equals("3"))
				myList.remove(value);
			System.out.println("List Value:" + value);
		}
		System.out.println(myList);
	}
}
