package codelearning.basic.multitasking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadRunner_FixedThreadPool {
	public static void main(String[] args) throws InterruptedException {
		MyTask t1 = new MyTask("RED");
		MyTask t2 = new MyTask("GREEN");
		MyTask t3 = new MyTask("BLUE");
//		int availableProcessors = Runtime.getRuntime().availableProcessors();
//		System.out.println("availableProcessors:"+availableProcessors);
//		ExecutorService executor =  Executors.newFixedThreadPool(availableProcessors);
		ExecutorService executor =  Executors.newFixedThreadPool(2);
		executor.submit(t1);
		System.out.println("Submitting task - 1");
		executor.submit(t2);
		System.out.println("Submitting task - 2");
		executor.submit(t3);
		System.out.println("Submitting task - 3");
		
		System.out.println("end");
		
		//try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		//another way to sleep the internal task to wait to shutdown.
		executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
		System.out.println("Shutdown calling");
		//executor.shutdown(); // execute all submitted task 
		executor.shutdownNow(); // BLUE thread not started, as not in current task exec
		
	}
}

class MyTask implements Runnable {
	private String name;
	MyTask(String name){
		this.name =  name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= name.length(); i++) {
			System.out.println(Thread.currentThread().isInterrupted());
try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("ERROR:"+name);}
			System.out.println(name + " : "+  i);
		}
	}
}
