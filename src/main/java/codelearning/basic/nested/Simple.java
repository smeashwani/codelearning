package codelearning.basic.nested;

public class Simple {
	private String name;
	public static String comp_name;
	public void check() {
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public class InnerClass{
		void check() {
			System.out.println("inner class");
			name = "welcome";
			comp_name = "welcome";
			
			class LocalInnerClass{
				void check() {
					
				}
			}
			LocalInnerClass obj = new LocalInnerClass();
		}
	}
	
	static public class StaticInnerClass{
		void check() {
			System.out.println("inner class");
			//name = "welcome";
			comp_name = "welcome";
		}
	}
}
