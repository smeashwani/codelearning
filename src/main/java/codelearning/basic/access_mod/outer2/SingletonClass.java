package codelearning.basic.access_mod.outer2;

public class SingletonClass {
	
	static SingletonClass obj ;
	
	String name;
	 
	private SingletonClass(String name) {
			this.name=name;
	}

	public String toString() {
		return "SingletonClass: "+ this.name;
	}
	
	public static SingletonClass getInstance(String name){
		if(obj == null)
		{
			obj = new SingletonClass(name);
			
		}
		return obj;
	}
	
}
