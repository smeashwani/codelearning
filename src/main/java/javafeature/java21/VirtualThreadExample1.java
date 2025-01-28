package javafeature.java21;

public class VirtualThreadExample1 {
	public static void main(String[] args) {
		

		Runnable task = () -> {
			System.out.println("Hello Virtual Thread!");
		};
		Thread.startVirtualThread(task);

		// another way to create virtual thread - lambda expression
		Thread.startVirtualThread(() -> {
			System.out.println("Hello Virtual Thread!");
		});
		// another way to create virtual thread - anonymous class
		Thread.startVirtualThread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello Virtual Thread!");
			}
		});

		// another way to create virtual thread - method reference
		Thread.startVirtualThread(VirtualThreadExample1::printHello);

		// another way to create virtual thread - Thread.runVirtualThread
		Thread.ofVirtual().start(VirtualThreadExample1::printHello);
	}

	public static void printHello() {
		System.out.println("Hello Virtual Thread!");
	}
}
