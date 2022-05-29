package codelearning.basic.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _4_FileReaderAndWriter {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("write1.txt");
			BufferedWriter bw = new BufferedWriter(fw)
			){
			fw.write(18);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader("write1.txt");
			BufferedReader br = new BufferedReader(fr)
				){
				System.out.println(fr.read());
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Copy completed ");
	}
	
	
}

