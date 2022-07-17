package codelearning.basic.threading;

public class ShutdownTask extends Thread {
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}
