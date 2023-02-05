package codelearning.basic.operator;

public class TypeCasting {
	public static void main(String[] args) {
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=5;j++) {
				if(i==2 && j==3 || i==2 && j==4) continue;
				System.out.println(i+" "+j);
			}
		}
		 
	}

}
