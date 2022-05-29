package codelearning.basic.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class _6_PrintStream {
public static void main(String[] args) throws FileNotFoundException {
	PrintStream out1 = new PrintStream("write.txt");
	PrintStream error = new PrintStream("error.txt");
	out1.print("welcome to ducat");
	out1.printf("welcome to ducat %s", "Guest");
	
	System.setOut(out1);
	System.setErr(error);
	System.out.printf("welcome to ducat %s", "Guest");
	System.err.printf("welcome to ducat %s", "Guest");
}
}
