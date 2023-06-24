package codelearning.basic.collect;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection5 {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("aaa");
		queue.add("dddd");
		queue.add("bbbb");
		queue.add("ccc");
//		System.out.println("head:" + queue.element());
//		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:" + queue);
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
