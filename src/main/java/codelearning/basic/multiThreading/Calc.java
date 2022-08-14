package codelearning.basic.multiThreading;

public class Calc {
	
	public void print() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "=" + currentThread);
			
			
		}
	}

}
