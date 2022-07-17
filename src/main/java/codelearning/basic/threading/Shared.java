package codelearning.basic.threading;

public class Shared {
	
	public int count=0;
	
	public void print1() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("PRINT -1 "+Thread.currentThread().getName() +" " +i + " - ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void print2() {
		synchronized(Shared.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println("PRINT -2 "+Thread.currentThread().getName() +" " +i + " - ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
