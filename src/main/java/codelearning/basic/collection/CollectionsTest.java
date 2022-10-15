package codelearning.basic.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {

    public static void main(String[] args) {
    	HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        HashSet<String> subSet = new HashSet<String>();
        subSet.add("E");
        subSet.add("B");
        subSet.add("A");
        subSet.add("F");
        hashSet.retainAll(subSet);
        System.out.println(hashSet);
    }
}