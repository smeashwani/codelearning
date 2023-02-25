package codelearning.basic.keywords;

public class Parent {
	
	String name;
	
	static 
	{
		System.out.println("parent...");
	}
	
	Parent(){
		name = "Guest";
		System.out.println("Parent.Parent()...");
	}
	
	Parent(int a){
		name = "Guest";
		System.out.println("Parent.Parent()");
	}
	
	{
		System.out.println("parent init...");
	}
	
	
	static 
	{
		System.out.println("parent");
	}
	
}
