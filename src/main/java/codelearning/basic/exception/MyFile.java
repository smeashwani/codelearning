package codelearning.basic.exception;

public class MyFile implements AutoCloseable {
	private String str;
	public MyFile(String str){
		this.str = str;
	}
	@Override
	public void close() throws Exception {
		System.out.print("file closed = "+str);
		
	}
	
	public void read() {
		
	}
	public void write() throws CheckedException {
		throw new CheckedException("exeception");
	}
}
