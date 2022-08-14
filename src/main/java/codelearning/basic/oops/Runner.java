package codelearning.basic.oops;

public class Runner {
	int age;
	Runner(int t){
		age=t;
	}
	
	public static void main(String[] args) {
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		
		MathUtils m = new MathUtils();
		m.a=aa;
		m.b=bb;
		System.out.println(m.a +m.b);
		m.add(m.a, m.b, 12);
		
		System.out.println(m.a +" " + m.b);
		Runner r = new Runner(22);
		Runner r1 = new Runner(21);
		System.out.println(r);
		System.out.println(r1);
	}
	
	@Override
	public String toString() {
		return "this is runner class"+this.age;
	}

 
}
