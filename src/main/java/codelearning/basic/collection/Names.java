package codelearning.basic.collection;

import java.util.LinkedHashSet;

public class Names {
    static String s;
    public Names(String s) {
        Names.s = s;
    }
    public static void main(String s[])
    {
    	LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();
        lhashSet.add(new Integer(1));
        lhashSet.add(new Integer(2));
        lhashSet.add(new Integer(3));
        lhashSet.add(new Integer(3));
        lhashSet.add(new Integer(5));
        lhashSet.add(new Integer(4));
        lhashSet.add(new Integer(5));
        lhashSet.add(new Integer(5));
        Object[] objArray = lhashSet.toArray();
        for (Object element : objArray)
            System.out.print(element + " ");

    }

}