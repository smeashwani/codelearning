package codelearning.basic.exception;

public class AutoCloseableRunner {
	
	public static void main(String[] args) throws Exception {
		//ExplictlyHandleClose();
		
		try(MyFile f = new MyFile("0"); MyFile f1 = new MyFile("1"); MyFile f2 = new MyFile("2")) {
			f.write();
		}
	}

	private static void ExplictlyHandleClose() {
		MyFile f = new MyFile("0");
		try {
			f.write();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				f.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
