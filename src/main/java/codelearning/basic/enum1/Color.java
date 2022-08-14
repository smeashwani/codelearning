package codelearning.basic.enum1;

public class Color {
	
	public static final Color RED = new Color("red");
	public static final Color GREEN = new Color("green");
	public static final Color BLUE = new Color("blue");
	
	private String name;

	private Color(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
