package codelearning.basic.io;

import java.io.File;

public class FileClass {
	public static void main(String[] args) {
		File f = new File("E:\\software\\training\\codelearning\\test");
		System.out.println(f.mkdir());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
	}

}
