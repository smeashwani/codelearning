package codelearning.basic.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Runnable r1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("Runnable-" + i);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//			}
//		};
		Callable<Integer> c1 = new Callable() {
			
			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 5; i++) {
					System.out.println("Runnable-" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return 1;
			}
		};
		
		ExecutorService pool = Executors.newCachedThreadPool();
		System.out.println("1");
		Future f = pool.submit(c1);
		
		System.out.println("2");
		pool.shutdown();
		Integer i  = (Integer) f.get();
		System.out.println("Result" + i);
		System.out.println("3");
		
		
//		Runnable r1 = new Task("task 1");
//        Runnable r2 = new Task("task 2");
//        Runnable r3 = new Task("task 3");
//        Runnable r4 = new Task("task 4");
//        Runnable r5 = new Task("task 5");      
//          
//        // creates a thread pool with MAX_T no. of 
//        // threads as the fixed pool size(Step 2)
//        ExecutorService pool = Executors.newFixedThreadPool(3);  
//         
//        // passes the Task objects to the pool to execute (Step 3)
//        pool.execute(r1);
//        pool.execute(r2);
//        pool.execute(r3);
//        pool.execute(r4);
//        pool.execute(r5);
//        pool.shutdown();
//        System.out.println("shutdown");
	}

}
