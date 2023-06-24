package codelearning.basic.collect;

import java.util.EnumSet;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		List<String> l = List.of("A","B","C");
		EnumSet<Color> allOf = EnumSet.allOf(Color.class);
		System.out.println(allOf);
		EnumSet<Color> range = EnumSet.range(Color.YELLOW, Color.BLUE);
		System.out.println(range);
		
	}
	
	public enum Color {
	    RED, YELLOW, GREEN, BLUE, BLACK, WHITE
	}


	
	
}



