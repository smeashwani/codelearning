package codelearning.basic.multiThreading;

public class Calc {
	int count=0;
	public void print1() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			synchronized (Calc.class) {
			System.out.println(i + "======" + currentThread +"Count=");
			}
		}
	}
	
	synchronized public void print2() {
		for(int i=0;i<10;i++) {
			count++;
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "#####" + currentThread +"Count=" +count);
		}
	}
	
	synchronized void print3() {
		for(int i=0;i<10;i++) {
			count++;
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "++++++" + currentThread +"Count=" +count);
		}
	}
	
	synchronized static public void print4() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "*****" + currentThread +"Count=");
		}
	}

}
