package codelearning.basic.exception;

public class Runner {
	static String s;
	public static void main(String[] args) throws Exception {
		try(MyFile f = new MyFile("abc.txt");){
			//f.write();
			f.read();
		}catch (Exception e) {
			System.out.println("Exception");
		}
//		MyFile f = new MyFile("abc.txt");
//		try {
//			f.write();
//			f.read();
//		} catch (Exception e) {
//			System.out.println("Exception");
//		}finally {
//			f.close();
//		}
		
		
	}

}
