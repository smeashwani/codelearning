package codelearning.basic.multiThreading;

public class Runner {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println("START"+ currentThread);
		MyThread t2 = new MyThread("Sec");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
		MyThread t1 = new MyThread("First");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		
		System.out.println("END");
	}
}

class MyThread extends Thread{
	
	private String name;

	public MyThread(String string) {
	 this.name = string;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "=" + name);
		}
	}
}
