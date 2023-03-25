package codelearning.basic.commandLine;

public class FunAndProcedure {
	public static void main(String[] args) {
		Example e = new Example();
		e.a=5;
		factorial(e);
		System.out.println(e.z);
	}
	
	static void factorial (Example obj){
		obj.z =1;
		for (int i = 1; i <= obj.a; i++) {
			obj.z *= i; 
		}
	}
}

class Example{
	int a;
	int z;
}
