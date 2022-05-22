package codelearning.basic.exception;

import java.io.IOException;
import java.sql.SQLException;

public class MyExceptionRunner {
	public static void main(String[] args) throws SQLException, IOException, CheckedException {
		System.out.println("start prog - property purchase");
		
		performAction();
		
		System.out.println("Property Buy successfully");
	}

	private static void performAction() throws SQLException, IOException, CheckedException {
		performAction2();
	}

	private static void performAction2() throws SQLException, IOException, CheckedException {
		int arr[] = {10,12};
		int a=0;
		if(a==0) {
			throw new IOException();
		}
		System.out.println("1");
		if(a ==1) {
			throw new SQLException();
		}
		if(a ==  2) {
			throw new UnCheckedException("welcome");
		}
		if(a ==  3) {
			throw new CheckedException("welcome");
		}
		 //a=arr[0]/0;
		 //System.out.println("2");
	}
	
	public void performAction3() throws Exception {
		throw new UnCheckedException("welcome");
	}
	
	public void performAction4() throws UnCheckedException {
		throw new UnCheckedException("welcome");
	}
	public void performAction5() throws CheckedException {
		
	}
}
