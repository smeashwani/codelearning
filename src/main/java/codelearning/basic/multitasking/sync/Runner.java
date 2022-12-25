package codelearning.basic.multitasking.sync;

public class Runner {
	public static void main(String[] args) {
		Shared s = new Shared();
		MyThread1 t1 = new MyThread1(s);
		t1.setName("FIRST");
		t1.start();
		MyThread2 t2 = new MyThread2(s);
		t2.setName("SEC");
		t2.start();
		
		MyThread3 t3 = new MyThread3(s);
		t3.setName("THIRD");
		t3.start();
		
		MyThread4 t4 = new MyThread4(s);
		t4.setName("FOUR");
		t4.start();
	}
}
class MyThread1 extends Thread{
	Shared shared;
	MyThread1(Shared s){
		this.shared =s ;
	}
	public void run() {
		shared.print1();
	}
}

class MyThread2 extends Thread{
	Shared shared;
	MyThread2(Shared s){
		this.shared =s ;
	}
	public void run() {
		Shared.print2();
	}
}

class MyThread3 extends Thread{
	Shared shared;
	MyThread3(Shared s){
		this.shared =s ;
	}
	public void run() {
		shared.print1();
	}
}

class MyThread4 extends Thread{
	Shared shared;
	MyThread4(Shared s){
		this.shared =s ;
	}
	public void run() {
		Shared.print2();
	}
}