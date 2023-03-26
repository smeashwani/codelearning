package codelearning.basic.batch2.exception;

public class ExceptionExample {
	
	public static void main(String[] args) {
		System.out.println("Start...");
		
		
		try(MyFile f1 = new MyFile("first");MyFile f2 = new MyFile("second");) {
		f1.read();
		f2.write();
		}
		catch (Exception e) {
			
		}
		
		System.out.println("end...");
	}

	
}
