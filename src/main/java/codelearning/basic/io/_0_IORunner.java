package codelearning.basic.io;

import java.io.File;

public class _0_IORunner {

	public static void main(String[] args) {
		//File f = new File("pom.xml");
		File f = new File("E:\\software\\training\\codelearning","pom.xml");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
	}

}
