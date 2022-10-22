package codelearning.basic.collection;

import java.util.HashMap;
import java.util.function.BiFunction;

public class CollectionsTest {

    public static void main(String[] args) {
    	HashMap<String,String> map = new HashMap<String,String>();
    	for(int i =0;i<15;i++) {
    		map.put("key1",""+i);
    	}
    	map.get("key1");
    	map.getOrDefault("key1", "default ");
    	
    }
}
