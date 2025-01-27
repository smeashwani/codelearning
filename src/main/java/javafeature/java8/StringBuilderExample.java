package javafeature.java8;

public class StringBuilderExample {
	static StringBuilder sb1 = new StringBuilder("yo ");
	static StringBuilder sb2 = new StringBuilder("hi ");
	public static void main(String[] args) {
		sb1 = sb1.append(new StringBuilderExample().foo(new StringBuilder("hey")));
		System.out.println(sb1);
	}
	private StringBuilder foo(StringBuilder s) {
		sb2 =  sb2.append(s + "oh ");
		return sb2;
	}
}
//interface interfaceOne{
//	public void methodA();
//	public void methodB();
//}
//interface interfaceTwo {}
//
//abstract class AbstractClass implements interfaceOne{
//	public String origin = "Abstract Class"; 
//	@Override
//	public void methodA() {
//		System.out.println("A");
//	}
//	public abstract void methodC();
//}
//class concreteClass extends AbstractClass{
//	public void methodC(String c) {
//		System.out.println(c);
//	}
//
//	@Override
//	public void methodB() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void methodC() {
//		// TODO Auto-generated method stub
//		
//	}
//}