package codelearning.basic.string;

public class MyString {
	public static void main(String[] args) {
		String str ="welcome to ducat";
		String str1 =new String("welcome to ducat");
		System.out.println(str.charAt(0));
		str  = str.concat(" in india");
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str);
		String valueOf = String.valueOf(true);
		String name ="Guest";
		String ctry = "india";
		String str2 = "welcome" +name+ "in ducat"; 
		String format = String.format("welcome %s in ducat %s", name, ctry);
		System.out.println(format);
		String arr[] = {"red","green","blue"};
		String join = String.join("-", arr);
		System.out.println(join);
		
		String s1 = "abc";
		String s2 = "abc";
		String ss1 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1 == ss1);
		System.out.println(s1 == ss1.intern());
		
		StringBuffer sb = new StringBuffer("Welcome ");
		sb.append(name);
		sb.append(" in ducat ");
		sb.append(ctry);
		System.out.println(sb);
		
		"welcome".toLowerCase().charAt(0);
		
		StringBuffer sb1 = new StringBuffer("Welcome ")
		.append(name)
		.append(" in ducat ")
		.append(ctry);
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Welcome ")
				.append(name)
				.append(" in ducat ")
				.append(ctry);
				System.out.println(sb1);
		
	}
}
