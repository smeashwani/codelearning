package codelearning.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _3_DataInputAndOutputStream {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("write.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			){
			dos.write(18);
			dos.writeDouble(25000.25000);
			dos.writeUTF("guest");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("write.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);
				){
				System.out.println(dis.read());
				System.out.println(dis.readDouble());
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Copy completed ");
	}
	
	
}

