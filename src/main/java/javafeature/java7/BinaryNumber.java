package javafeature.java7;

public class BinaryNumber {
	public static void main(String[] args) {
		// An 8-bit 'byte' value:
		// 0b 256 128 64 32 16 8 4 2 1
		byte aByte = (byte)0b00100001;
		System.out.println(aByte); 
		// A 16-bit 'short' value:
		short aShort = (short)0b1010000101000101;
		System.out.println(aShort);
		// Some 32-bit 'int' values:
		int anInt1 = 0b10100001010001011010000101000101;
		int anInt2 = 0b101;
		int anInt3 = 0B101; // The B can be upper or lower case.
		System.out.println(anInt1);
		System.out.println(anInt2);
		System.out.println(anInt3);
	}
}
//output
//33
//-24251
//-1589272251
//5
//5