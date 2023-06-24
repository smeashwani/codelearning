package codelearning.basic.collect;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class MyProperty {
public static void main(String[] args) throws IOException {
	Properties p=new Properties(); 
	FileInputStream fis=new FileInputStream("abc.properties");
	p.load(fis); 
	System.out.println(p);
	//{user=scott,password=tiger, venki=8888}
	String s=p.getProperty("venki");
	System.out.println(s);//8888
	p.setProperty("nag","1111");
	System.out.println(p);
//	Enumeration e=p.propertyNames();
//	while(e.hasMoreElements())
//	{
//	String s1=(String)
//	e.nextElement();
//	System.out.println(s1);
//	//nag //user //password //venki
//	}
	/*
	 * FileOutputStream fos=new FileOutputStream("abc.properties");
	 * p.store(fos,"updated by Guest");
	 */
}
}
