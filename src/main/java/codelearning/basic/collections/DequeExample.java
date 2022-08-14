package codelearning.basic.collections;
import java.util.*; 
public class DequeExample { 
public static void main(String[] args) { 
   Deque<String> deque=new ArrayDeque<String>(); 
   deque.offer("arvind"); 
   deque.offer("vimal"); 
   deque.add("mukul"); 
   deque.offerFirst("jai"); 
   System.out.println("After offerFirst Traversal..."); 
   for(String s:deque){ 
       System.out.println(s); 
   } 
   //deque.poll(); 
   //deque.pollFirst();//it is same as poll() 
   deque.pollLast(); 
   System.out.println("After pollLast() Traversal..."); 
   for(String s:deque){ 
       System.out.println(s); 
   } 
   System.out.println("--------------");
   ArrayDeque<String> stack = new ArrayDeque<>();
   stack.push("a"); // [a]
   stack.push("b"); // [b, a]
   System.out.println(stack.peek()); // b [b, a]
   System.out.println(stack.pop()); // b [a]
   System.out.println(stack.peek()); // a [a]
   System.out.println(stack.pop()); // a []
   System.out.println(stack.peek()); // null
} 
}
