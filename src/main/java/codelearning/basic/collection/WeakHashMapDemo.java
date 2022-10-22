package codelearning.basic.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
//		WeakHashMap m = new WeakHashMap();
//		Temp t = new Temp();
//		m.put(t, "ashok");
//		System.out.println(m);// {Temp=ashok}
//		t = null;
//		System.gc();
//		Thread.sleep(5000);
//		System.out.println(m);
		
//		IdentityHashMap m=new IdentityHashMap();
//		   Integer i1=210;
//		   Integer i2=210;
//		   m.put(i1,"pavan");
//		   m.put(i2,"kalyan");
//		   System.out.println(m);
//		Properties p=new Properties(); 
//		FileInputStream fis=new FileInputStream("abc.properties");
//		p.load(fis); 
//		System.out.println(p);
//		//{user=scott,password=tiger, venki=8888}
//		String s=p.getProperty("venki");
//		System.out.println(s);//8888
//		p.setProperty("nag","9999999");
//		Enumeration e=p.propertyNames();
//		while(e.hasMoreElements())
//		{
//		String s1=(String)
//		e.nextElement();
//		System.out.println(s1);
//		//nag
//		//user
//		//password
//		//venki
//		}
//		FileOutputStream fos=new FileOutputStream("abc.properties");
//		p.store(fos,"updated by ducat");

		
		List<String> myList = new CopyOnWriteArrayList<String>();

	       myList.add("1");
	       myList.add("2");
	       myList.add("3");
	       myList.add("4");
	       myList.add("5");

	       Iterator<String> it = myList.iterator();
	       while (it.hasNext()) {
	           String value = it.next();
	           System.out.println("List Value:" + value);
	           if (value.equals("3"))
	               myList.remove(value);
	       }

	       Map<String, String> myMap = new ConcurrentHashMap<String, String>();
	       myMap.put("1", "1");
	       myMap.put("2", "2");
	       myMap.put("3", "3");

	       Iterator<String> it1 = myMap.keySet().iterator();
	       while (it1.hasNext()) {
	           String key = it1.next();
	           System.out.println("Map Value:" + myMap.get(key));
	           if (key.equals("2")) {
	                myMap.put("4", "4");
	           }
	       }



	}
}

class Temp {
	public String toString() {
		return "Temp";
	}

	public void finalize() {
		System.out.println("finalize() method called");
	}
}
