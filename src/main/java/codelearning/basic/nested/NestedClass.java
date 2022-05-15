package codelearning.basic.nested;

import codelearning.basic.nested.Simple.InnerClass;
import codelearning.basic.nested.Simple.StaticInnerClass;

public class NestedClass {
	public static void main(String[] args) {
		Simple s = new Simple();
		s.setName("ducat");
		s.check();
		
		InnerClass innerClass = s.new InnerClass();
		innerClass.check();
		
		Simple.StaticInnerClass inn =  new StaticInnerClass();
		inn.check();

		
		
		
//Anonymous
		Simple s1 = new Simple() {
			@Override
			public void check() {
				System.out.println("Inner:"+ getName());
			}
		};
		s1.setName("india");
		s1.check();
	}
}
