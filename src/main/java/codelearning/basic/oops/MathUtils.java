package codelearning.basic.oops;

public class MathUtils extends Object{
	int a;
	int b;
	int c;
	
	public void add(int a, int b) {
		this.a = a+ 1;
		this.b = b + 1;
	}
	
	public void add(int a, int b, int c) {
		this.add(a,b);
		this.c = c + 1;	
	}
	
	public void add(int a) {
		this.add(a,b);
		this.c = c + 1;	
	}
	
	
}
