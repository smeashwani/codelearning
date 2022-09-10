package codelearning.basic.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SuperRunner {
	
	static {
		try {
			PrintStream err = new PrintStream("err.txt");
			System.setErr(err);
			PrintStream out = new PrintStream("out.txt");
			System.setOut(out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
