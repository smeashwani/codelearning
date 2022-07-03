package codelearning.basic.oops;

public class Runner {
	
	public static void main(String[] args) {
		MathUtils m = new MathUtils();
		m.a=10;
		m.b=20;
		System.out.println(m.a +" " +m.b);
		m.add(m.a, m.b, 12);
		
		System.out.println(m.a +" " + m.b);
		
	}

 
}
