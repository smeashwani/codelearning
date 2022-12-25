package codelearning.basic.multitasking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadRunner_callable {
	public static void main(String[] args) throws InterruptedException {
		MyTask1 t1 = new MyTask1("RED");
		MyTask1 t2 = new MyTask1("GREEN");
		MyTask1 t3 = new MyTask1("BLUE");
		
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
		executor.shutdown(); // execute all submitted task 
		//executor.shutdownNow(); // BLUE thread not started, as not in current task exec
		
	}
}
class MyTask1 implements Callable {
	private String name;
	MyTask1(String name){
		this.name =  name;
	}
	@Override
	public Integer call() {
		for (int i = 1; i <= name.length(); i++) {
try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("ERROR:"+name);}
			System.out.println(name + " : "+  i);
		}
		return name.length();
	}
}
