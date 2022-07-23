package codelearning.basic.nested;

public class NestedClass {
	public static void main(String[] args) {
		int a=10;
		Simple s = new Simple() {
			void check() {
				System.out.println(a);
			}
		};
		
	} 
}
