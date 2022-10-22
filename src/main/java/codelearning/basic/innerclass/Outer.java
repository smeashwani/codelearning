package codelearning.basic.innerclass;

public class Outer {
	
	
	static class StaticInner {
		static int i=0;
		int a=10;
		void check() {
			System.out.println(a);
		//	System.out.println(aa);
		//	System.out.println(Outer.this.aa);
		}
	}
	
	class Inner {
		//static int i=0;
		int a=10;
		void check() {
			System.out.println(a);
			System.out.println(Outer.this.aa);
		}
	}
	
	int aa=10;
	
	static void check() {
		//System.out.println(this.aa);
	}

}
