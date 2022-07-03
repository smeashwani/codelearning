package codelearning.basic.threading;

public class MultiThreadingRunner1 {
	public static void main(String[] args) throws InterruptedException {
		MyTask task1 = new MyTask("First");
		Thread t1 = new Thread(task1);
		//t1.setPriority(Thread.MIN_PRIORITY);+
		t1.setDaemon(true);
		t1.start();
		//System.out.println(t1);
		MyTask task2 = new MyTask("Second");
		Thread t2 = new Thread(task2);
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
class MyTask implements Runnable {
	String name;
	public MyTask(String string) {
		this.name=string;
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

