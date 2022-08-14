package codelearning.basic.multiThreading;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		Thread currentThread = Thread.currentThread();
		System.out.println("START: "+ currentThread +  currentThread.getState());

		MyThread t2 = new MyThread("Sec");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setDaemon(true);
		t2.start();
		
		
		MyThread t1 = new MyThread("First");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setDaemon(true);
		t1.start();
		
		
		//t1.join();t2.join();
		
		for(int i=0;i<5;i++) {
			System.out.println(i + "=" + currentThread + currentThread.getState());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("END ");
		System.out.println("=========== "+t2.getState());
	}
}

class MyThread extends Thread{
	
	public MyThread(String string) {
	 setName(string);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "=" + currentThread + currentThread.getState());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThreadRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i + "=" + currentThread);
		}
	}
}
