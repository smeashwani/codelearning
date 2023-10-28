package codelearning.basic.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class HindiText {
	
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",new Locale("en","IN"));
		String val = bundle.getString("howareyou");
		System.out.println("output");
		System.out.println(val);
	}
}