package program;

public class CvtIntoWords {
	static String keywords[] = {"one", "two","three",  "four","five","six","seven","eight","nine"};
	static String save [] = new String[5];
	
	public static void main(String[] args) {
		word(12545);
		for(int i=0;i<5;i++)
			System.out.print (save[i] + " ");
	}

	private static void word(int num) {
		String str = "";
		int i=5;
		while(num >0 ) {
			 int rem = num % 10;
			 save[--i] = keywords[rem -1 ];
			 num = num / 10;
		}
	}

}
