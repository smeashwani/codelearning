package codelearning.basic.threading;

public class TestShutdown {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new ShutdownTask());

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}


