package codelearning.basic.threading;

public class Task implements Runnable {
	String name;
	public Task(String string) {
		this.name= string;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name+ "-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
