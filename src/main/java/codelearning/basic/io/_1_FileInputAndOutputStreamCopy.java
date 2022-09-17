package codelearning.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//Direct :- Copy completed 38_882
//buffer Copy completed 467
//copyWithNIO  19
public class _1_FileInputAndOutputStreamCopy {

	public static void main(String[] args) {
		File fi = new File("Image10MB.jpg");
		File fo = new File("Copy_Image10MB.jpg");
		long start = System.currentTimeMillis();
		//copy(fi, fo);
		//copyWithBuffer(fi, fo);
		copyWithNIO(fi, fo);
		long end = System.currentTimeMillis();
		System.out.printf("Copy completed %d", end-start);
	}

	private static void copy(File fi, File fo) {
		try(FileInputStream fis = new FileInputStream(fi); 
			FileOutputStream fos = new FileOutputStream(fo)){
			int read =0;
			 while( (read = fis.read()) != -1) {
				 //System.out.print((char)read);
				 fos.write(read);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static void copyWithBuffer(File fi, File fo) {
		try(FileInputStream fis = new FileInputStream(fi);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(fo);
			BufferedOutputStream bos = new BufferedOutputStream(fos);		
			){
			int read =0;
			 while( (read = bis.read()) != -1) {
				 //System.out.print((char)read);
				 bos.write(read);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void copyWithNIO(File fi, File fo) {
	try {	
		Path path = Files.copy(Paths.get(fi.getAbsolutePath()), Paths.get(fo.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);//copy with REPLACE_EXISTING option
		//System.out.println("Target file Path : "+path);
		//System.out.println("Copied Content : \n"+new String(Files.readAllBytes(path)));
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}
