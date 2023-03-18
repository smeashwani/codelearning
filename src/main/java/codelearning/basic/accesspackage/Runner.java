package codelearning.basic.accesspackage;


import codelearning.basic.accesspackage1.Employee;
import codelearning.basic.accesspackage1.Employee2;
import static codelearning.basic.accesspackage1.subpackage1.Test.*;

public class Runner extends Employee{
	
	Runner(){
		publicMethod();
		//packageMethod();
		protectedMethod();
	}
	public static void main(String[] args) {
		
	}
}
