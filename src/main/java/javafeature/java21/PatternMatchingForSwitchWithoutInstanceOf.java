package javafeature.java21;

public class PatternMatchingForSwitchWithoutInstanceOf {

	public static void main(String[] args) {
		System.out.println(formatterPatternSwitch(10));
	}
	
	static String formatterPatternSwitch(Object obj) {
	    return switch (obj) {
	        case Integer i -> String.format("int %d", i);
	        case Long l    -> String.format("long %d", l);
	        case Double d  -> String.format("double %f", d);
	        case String s  -> String.format("String %s", s);
	        default        -> obj.toString();
	    };
	}
	
	

}
