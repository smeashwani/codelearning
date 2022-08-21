package codelearning.basic.multiThreading;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Calc common = new Calc(); MyThread11 t1 = new MyThread11("First",common);
		 * MyThread22 t2 = new MyThread22("Sec",common); MyThread33 t3 = new
		 * MyThread33("Third",common); MyThread44 t4 = new MyThread44("Fourth",common);
		 * t1.start(); t2.start(); t3.start(); t4.start();
		 */
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
		
		

	}
}

class MyThread11 extends Thread{
	private Calc common;
	public MyThread11(String string, Calc common) {
	 setName(string);
	 this.common = common;
	}
	@Override
	public void run() {
		//Calc.print1();
	}
}

class MyThread22 extends Thread{
	private Calc common;
	public MyThread22(String string, Calc common) {
	 setName(string);
	 this.common = common;
	}
	@Override
	public void run() {
		common.print2();
	}
}

class MyThread33 extends Thread{
	private Calc common;
	public MyThread33(String string, Calc common) {
	 setName(string);
	 this.common = common;
	}
	@Override
	public void run() {
		common.print3();
	}
}
class MyThread44 extends Thread{
	private Calc common;
	public MyThread44(String string, Calc common) {
	 setName(string);
	 this.common = common;
	}
	@Override
	public void run() {
		Calc.print4();
	}
}
