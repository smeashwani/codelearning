package codelearning.basic.multitasking;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyTask2 t1 = new MyTask2("RED");
		MyTask2 t2 = new MyTask2("GREEN");
		MyTask2 t3 = new MyTask2("BLUE");
		
		ExecutorService executor =  Executors.newFixedThreadPool(2);
		//ExecutorService executor =  Executors.newSingleThreadExecutor();
		// submit all the task
		List<Future<Integer>> allTask = executor.invokeAll(Arrays.asList(t1, t2, t3));
		
		System.out.println("end");
		
		int sum=0;
		for (Future<Integer> task : allTask) {
			System.out.println(task.get());
			sum +=  task.get();
		}
		
		System.out.println("Total Length: "+ sum);
			
		
	}
}

class MyTask2 implements Callable<Integer> {
	private String name;
	MyTask2(String name){
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
