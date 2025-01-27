package javafeature.java16;

import javafeature.java5.Child1;
import javafeature.java5.Child2;
import javafeature.java5.Parent;

public class PatternMatching {
	public static void main(String[] args) {
		System.out.println(getDetailsOldWay(new Child1()));
		System.out.println(getDetailsNewWay(new Child1()));
	}
	
    public static String getDetailsOldWay(Parent v) {
        if (v instanceof Child1) {
            Child1 c1 = (Child1) v;
            return c1.getDetails();
        } else if (v instanceof Child2) {
        	Child2 c2 = (Child2) v;
            return c2.getDetails();
        } else throw new IllegalArgumentException();
    }
    public static String getDetailsNewWay(Parent v) {
        if (v instanceof Child1 c1) {
            return c1.getDetails();
        } else if (v instanceof Child2 c2) {
            return c2.getDetails();
        } else throw new IllegalArgumentException();
    }
}