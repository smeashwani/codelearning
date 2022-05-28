package codelearning.basic.io;

import java.io.File;

public class _0_IORunner {

	public static void main(String[] args) {
		//File f = new File("pom.xml");
		File f = new File("C:\\Users\\java\\eclipse-workspace\\codelearning","pom.xml");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

}
