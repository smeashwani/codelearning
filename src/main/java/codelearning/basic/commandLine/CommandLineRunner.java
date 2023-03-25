package codelearning.basic.commandLine;

public class CommandLineRunner {
	public static void main(String[] args) {
		
		//Integer a = new Integer(10);
		Integer a = 10;
		int aa = a.intValue();
		Integer b = new Integer(10);
		int bb = b.intValue();
		System.out.println(a.intValue()+b.intValue());
		System.out.println(a+b);
		int i =1;
		i++;
		
		Integer ii = new Integer(1);
		ii++;
		int inc = ii.intValue();
		inc ++;
		ii = new Integer(inc);
		
		System.out.println(i);
	
		
	}
}