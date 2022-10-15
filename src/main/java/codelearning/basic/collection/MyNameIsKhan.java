package codelearning.basic.collection;

import java.util.HashSet;
import java.util.Set;

public class MyNameIsKhan {
    private final String first, last;
    public MyNameIsKhan(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public boolean equals(Object o) {
    	System.out.println("equals");
        if (!(o instanceof MyNameIsKhan))
            return false;
        MyNameIsKhan n = (MyNameIsKhan) o;
        return n.first.equals(first) || n.last.equals(last);
    }
    public static void main(String[] args) {
        Set<MyNameIsKhan> s = new HashSet<MyNameIsKhan>();
        s.add(new MyNameIsKhan("Shahrukh", "Khan"));
        System.out.println(s.contains(new MyNameIsKhan("Shahrukh", "Khan")));
    }
    @Override
    public int hashCode() {
    	return 10;
    }
}