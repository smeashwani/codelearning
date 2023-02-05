package codelearning.basic.enum1;

public class EnumRunner {
	public static void main(String[] args) {
		Color redColor = Color.RED;
		System.out.println(redColor.getName());
		ColorEnum blueColor = ColorEnum.BLUE;
		System.out.println(blueColor.getName());
		ColorEnum[] values = ColorEnum.values();
		for (ColorEnum colorEnum : values) {
			System.out.println(colorEnum.getName());
		}
		
	}

}
