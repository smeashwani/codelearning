package codelearning.basic.collection;

public class LambdaInterface {
	static int count=0;
	public static void main(String[] args) {
		count++;
		int localCount=6;
		MyInterface my = new MyInterface() {
			@Override
			public int add(int a, int b) {
				System.out.println(localCount);
				return Math.addExact(a, b);
			}
		};
		
		
//
//		System.out.println(my.add(2, 3));
//
//		MyInterface my1 = (a, b) -> a + b;
//		MyInterface my2 = Math::addExact;
//
//		System.out.println(my1.add(2, 3));
		
		MyPrinter myprinter1 = new MyPrinter() {
			
			@Override
			public void print(String s) {
			System.out.println("___"+s+"___");
			}
		};
		
		myprinter1.print("welcome");
		MyPrinter myprinter2 = s -> {
			System.out.println("___"+s+"___");
		};
		myprinter2.print("ducat");
	}
}

@FunctionalInterface
interface MyInterface {
	int add(int a, int b);
}

interface MyPrinter {
	public void print(String s);
}