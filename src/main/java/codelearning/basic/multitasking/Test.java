package codelearning.basic.multitasking;

class Test {
	public static void main(String args[]) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15_000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10_000);
			}
		}.start();

	}
}