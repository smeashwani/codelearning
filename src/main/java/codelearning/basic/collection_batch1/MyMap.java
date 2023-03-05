package codelearning.basic.collection_batch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class MyMap {
	public static void main(String[] args) throws IOException {
//		Employee e3 = new Employee(11,"Guest1",13_000);
//		Employee e1 = new Employee(12,"Guest",11_000);
//		Employee e2 = new Employee(13,"Guest",12_000);
//	
//		Map<Employee,String> h = new WeakHashMap();
//		h.put(e3, "One One");
//		h.put(e1, "One");
//		h.put(e2, "two");
//		
//		e1 = null;
//		System.gc();
//		System.out.println(h);
//		System.out.println(h.size());
		
		
		
		Properties p=new Properties(); 
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis); 
		System.out.println(p);
		//{user=scott,password=tiger, venki=8888}
		String s=p.getProperty("venki");
		System.out.println(s);//8888
		p.setProperty("nag","9999999");
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
		String s1=(String)
		e.nextElement();
		System.out.println(s1);
		//nag //user //password //venki
		}
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"updated by Guest");

		
	}

}
