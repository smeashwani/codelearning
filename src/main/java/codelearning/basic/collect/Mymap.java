package codelearning.basic.collect;

import java.util.Map;
import java.util.TreeMap;

public class Mymap {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("11", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("1", "Four");
		map.put("15", "Five");
		System.out.println(map);
	}
}
