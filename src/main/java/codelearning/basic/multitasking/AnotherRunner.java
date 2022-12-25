package codelearning.basic.multitasking;

public class AnotherRunner {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		Thread tt1 = new Thread(t1);
		tt1.setName("First");
		Runtime r=Runtime.getRuntime();    
		r.addShutdownHook(tt1);
		
		for(int i =0; i<2; i++) {
			try {
				Thread.sleep(10);
				System.exit(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ i);
		}
		
		System.out.println("End of program");
		
//		Thread tt2 = new Thread(t1);
//		tt1.setDaemon(true);
//		tt2.setDaemon(true);
//		tt2.start();
//		tt1.start();
//		tt2.setName("Second");
//		
////		tt2.join();
////		tt1.join();
//		
//	
//		
//		for(int i =0; i<8; i++) {
//			try {
//				Thread.sleep(1000);
//				//System.exit(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+ i);
//		}
	}

}

class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i =0; i<2; i++) {
			System.out.println(Thread.currentThread().getName()+ i);
		}
	}
}