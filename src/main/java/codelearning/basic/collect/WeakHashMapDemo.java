package codelearning.basic.collect;

import java.util.HashMap;
import java.util.WeakHashMap;

class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		HashMap m = new HashMap<>();
//		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "ashok");
		System.out.println(m);// {Temp=ashok}
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
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
