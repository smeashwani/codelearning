package codelearning.basic.statickeyword;

public class BoundingClass {
	static int count=0;
	
	{
	 count++;
	 if(count==6) {
		 int a=10/0;
	 }
	}
}
