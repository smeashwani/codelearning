package codelearning.basic.threading;

public class MultiThreadingRunner {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("First");
		//t1.setPriority(Thread.MIN_PRIORITY);+
		t1.setDaemon(true);
		t1.start();
		//System.out.println(t1);
		MyThread t2 = new MyThread("Second");
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.setDaemon(true);
		t2.start();
	
		//System.out.println(t2);
		//t2.yield();
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		for (int i = 0; i < 2; i++) {
			Thread.sleep(1000);
//			System.out.println("STATE");
//			System.out.println(t1.getState());
//			System.out.println(t2.getState());
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+ ": "+i);
		}
		
	}
}
class MyThread extends Thread{
	String name;
	public MyThread(String string) {
		setName(string);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+ ": "+i);
		}
	}
}

