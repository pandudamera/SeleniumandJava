package icici.loan.eduloan;

public class WrapperClassDemo {

	public static void main(String[] args) {

		/*
		 * byte(Primitive) ----> Byte (Wrapper Class) short (Primitive) ---> Short
		 * (Wrapper Class) int (Primitive) ----> Integer (Wrapper Class) long
		 * (Primitive)----> Long (Wrapper Class) float (Primitive) ----> Float (Wrapper
		 * Class) double (Primitive) -----> Double (Wrapper Class) char(Primitive)
		 * ------> Character (Wrapper Class) boolean (Primitive) ----> Boolean (Wrapper
		 * Class)
		 */

		// Primitive to Wrapper class

		int x = 10; // No built in methods
		System.out.println("Primitive Integer Value is: " + x);
		// Integer y=Integer.valueOf(x);// Internal working // Auto boxing
		Integer i = x; // Auto boxing // Built in methods in integer class
		System.out.println("Wrapper Double Value is: " + i);

		// Wrapper class to Primitive

		Double y = 60.90;

		System.out.println("Wrapper Double Value is: " + y);
		byte u = y.byteValue();
		//byte b = u;
		System.out.println("Primitive Byte Value is: " + u);

		// String class to Wrapper class
		String str = "100";
		String str1 = "100";
		System.out.println("String Class Value is: " + str);
		System.out.println("String Class Value is: " + str1);
		short s = Short.parseShort(str);
		short s1 = Short.parseShort(str1);
		short s2 = (short) (s + s1);
		System.out.println("Wrapper Short Value is: " + s2);

		String strObject = "134232.324221";

		System.out.println("String Class Value is: " + strObject);

		double d = Double.parseDouble(strObject);
		System.out.println("Wrapper to double: " + d);

		// Primitive to String class
		int th = 908;
		System.out.println("Primitive Byte Value is: " + th);
		String d6 = String.valueOf(th);
		System.out.println("String value: " + d6);
	}

}
