package codelearning.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1_FileInputAndOutputStream {

	public static void main(String[] args) {
		File fi = new File("pom.xml");
		try(FileInputStream fis = new FileInputStream(fi)){
			int read =0;
			 while( (read = fis.read()) != -1) {
				 System.out.print((char)read);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fo = new File("pom1.xml");
		try(FileOutputStream fos = new FileOutputStream(fo)){
			char ch='a';
			fos.write(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
