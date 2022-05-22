package codelearning.basic.exception;

import java.sql.SQLException;

public class MyExceptionRunnerAdv extends  MyExceptionRunner {

	public void performAction3() throws Exception {
		throw new SQLException();
	}
	
	public void performAction4()  {
		throw new UnCheckedException("welcome");
	}
	
	public void performAction5() throws CheckedException {
		throw new CheckedException("welcome");
	}
}
