package codelearning.basic.innerclass;

public class Local {
	int a=10;
	static int aa=10;
	void check() {
		class LocalInnerClass{
			void test() {
				System.out.println(a);
				System.out.println(aa);
			}
		}
		LocalInnerClass inner = new LocalInnerClass();
		inner.test();
	}
	
	void verify() {
		int t=10;
	}

}
