package codelearning.basic.i18n;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Locale l = new Locale(null);
		//Locale locale = Locale.getDefault();
		
		Locale locale = Locale.FRANCE;
		System.out.println(locale);
//		System.out.println(locale.getDisplayCountry());  
//		System.out.println(locale.getDisplayLanguage());  
//		System.out.println(locale.getDisplayName());  
//		System.out.println(locale.getISO3Country());  
//		System.out.println(locale.getISO3Language());  
//		System.out.println(locale.getLanguage());  
//		System.out.println(locale.getCountry());
//		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",locale);
//		String greeting = bundle.getString("greeting");
//		String java = bundle.getString("java");
//		System.out.println(greeting+ ": Message in "+locale +":"+java );
		
//		Properties properties = System.getProperties(); 
//		properties.forEach(( k,v) ->
//							System.out.println( k + " - " + v)
//						   );
//		System.out.println(properties.getProperty("file.encoding"));
		 
//// get the data from custom properties file		 
//		Properties appProps = new Properties();
//		File f = new File(".");
//		String filename = f.getCanonicalPath()+"\\src\\main\\java\\MessageBundle.properties";
//		appProps.load(new FileInputStream(filename));
//		String value = appProps.getProperty("greeting");
//		System.out.println(value);
////		 
//		for(int k = 2029; k<=2360 ; k++)
//        {
//            System.out.println(k+  " "+(char)k+" ");
//        }
//
//
//		printNumber(Locale.UK);
//		printNumber(Locale.US);
//		printNumber(Locale.FRANCE);
//		printNumber(new Locale("en","IN"));
		
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.FRANCE);
		printCurrency(new Locale("en","IN"));

	}



	static void printNumber(Locale locale) {
		double dbl = 105000.3245;
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number + " for the locale " + locale);
	}
//
	static void printCurrency(Locale locale) {
		double dbl = 10500.3245;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency + " for the locale " + locale);
	}

}
