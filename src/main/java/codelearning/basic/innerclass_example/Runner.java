package codelearning.basic.innerclass_example;

public class Runner {
	public static void main(String[] args) {
		Outer outerObj = new Outer();
		System.out.println(outerObj.name1);
		System.out.println(outerObj.obj1.length());
		outerObj.obj.test();
		System.out.println(Outer.name1);
		
		//Outer.Inner obj1 = outerObj.new Inner();
		//Outer$Inner ob = new Outer$Inner();
		
		
//		Outer.Inner obj2 = new Outer.Inner();
		//Outer.Inner obj2 = outerObj.new Inner();
		//System.out.println(obj2.name2);
	}
}
