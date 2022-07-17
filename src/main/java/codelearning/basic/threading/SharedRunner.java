package codelearning.basic.threading;

public class SharedRunner {
	public static void main(String[] args) {
		Shared shared = new Shared();
		
		Thread t1 = new Thread() {
			public void run() {
				shared.print1();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				shared.print2();
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
				shared.print2();
			}
		};
		
		Thread t4 = new Thread() {
			public void run() {
				shared.print1();
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
