package codelearning.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _2_FileInputAndOutputStream_copy {

	public static void main(String[] args) {
		System.out.println("Copy start");
		File fi = new File("5MB.jpeg");
		File fo = new File("5MB_copy.jpeg");
		//FileCopy(fi, fo); //Copy start //Copy completed 25278
		//FileCopy1(fi, fo); //Copy start // Copy completed 83
		FileCopy2(fi, fo);
	}
	
	private static void FileCopy2(File fi, File fo) {
		long startTime = System.currentTimeMillis();
		try(FileInputStream fis = new FileInputStream(fi);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(fo);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			){
			int read =0;
			byte b[] = new byte[512];
			 while( (read = bis.read(b)) != -1) {
				 bos.write(b);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Copy completed "+ (endTime-startTime));
	}
	
	private static void FileCopy1(File fi, File fo) {
		long startTime = System.currentTimeMillis();
		try(FileInputStream fis = new FileInputStream(fi);
			FileOutputStream fos = new FileOutputStream(fo)){
			int read =0;
			byte b[] = new byte[512];
			 while( (read = fis.read(b)) != -1) {
				 fos.write(b);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Copy completed "+ (endTime-startTime));
	}

	private static void FileCopy(File fi, File fo) {
		long startTime = System.currentTimeMillis();
		try(FileInputStream fis = new FileInputStream(fi);
			FileOutputStream fos = new FileOutputStream(fo)){
			int read =0;
			 while( (read = fis.read()) != -1) {
				 fos.write(read);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Copy completed "+ (endTime-startTime));
	}

}
