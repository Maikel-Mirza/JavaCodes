package week02_elementary_programming;

public class TypeCastingExample {
	public static void main(String[] args) {
		int i = 4;
		System.out.println(i);
		double d = 4; // 	Implicit casting, type widening
		System.out.println(d);
		
		// Explicit casting; type narrowing
//		int i0 = 3.0; // Error
		int i1 = (int)3.0; // Fraction part is truncated
		int i2 = (int)3.8; // Fraction part is truncated
		int i3 = (int)3.2; // Fraction part is truncated
		int i4 = (int)3.26899742571; // Fraction part is truncated
		
		System.out.println(5 / 2.0);
//		int x = 5 / 2.0; // Error
		int x = (int)(5 / 2.0);
//		x = 5 / (int)2.0;
		System.out.println("x = " + x);

	}
}
