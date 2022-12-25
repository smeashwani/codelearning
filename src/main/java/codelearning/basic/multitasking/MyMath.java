package codelearning.basic.multitasking;

public class MyMath {
	public void task1() {
		Thread currentThread = Thread.currentThread();
		for(int i =0;i<10;i++) {
			System.out.println(currentThread.getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void task2() {
		Thread currentThread = Thread.currentThread();
		for(int i =0;i<10;i++) {
			System.out.println(currentThread.getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
