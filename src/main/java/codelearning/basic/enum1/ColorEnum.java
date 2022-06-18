package codelearning.basic.enum1;

public enum ColorEnum {
	RED("red"),GREEN("green"),BLUE("blue");

	private String name;

	private ColorEnum(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

}
