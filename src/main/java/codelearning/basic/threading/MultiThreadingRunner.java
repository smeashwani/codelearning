package codelearning.basic.threading;

public class MultiThreadingRunner {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("First");
		t1.start();
		MyThread t2 = new MyThread("Second");
		t2.start();
		for (int i = 0; i < 10; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+ ": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread extends Thread{
	String name;
	public MyThread(String string) {
		setName(string);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+ ": "+i);
		}
	}
}

