package codelearning.basic.multitasking.sync;

public class Shared {
	int count=1;
	synchronized public void print1() {
		for(int i=1;i<=5;i++) {
			try {Thread.sleep(1_000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("PRINT 1: "+ Thread.currentThread().getName() +" : " +i );
		}
	}
	
	static synchronized public void print2() {
		for(int i=1;i<=5;i++) {
			try {Thread.sleep(1_000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("PRINT 2: "+ Thread.currentThread().getName() +" : " +i);
		}
	}

}
