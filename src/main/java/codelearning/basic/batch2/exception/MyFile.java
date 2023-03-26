package codelearning.basic.batch2.exception;

import java.io.Closeable;
import java.io.IOException;

public class MyFile implements Closeable {
	String filename;

	public MyFile(String name) {
		filename = name;
	}

	@Override
	public void close() throws IOException {
		System.out.println(filename + " File closed");

	}
	
	void read() {
		
	}
	void write() {
		int i =  10/0;
	}
}
