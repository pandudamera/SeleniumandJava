package icici.loan.eduloan;

public class DataTypeDemoDefault {

	// integer types
		byte b; //1 byte
		short s; // 2 bytes
		int x;// 4 bytes
		long i; // 8 bytes
		
		// floating type
		
		float f; // 4 bytes
		double d; // 8 bytes
	   
		boolean bc;
		char c; //2 bytes
		
		static String name;
		
		static byte b1; 
		static short s1; 
		static int x1;
		static long i1;
		
		static float f1;
		static double d1;
		
		static boolean bc1;
		static char c1;
		
		static String name1; 
		
		public static void main(String[] args) {
			
			DataTypeDemoDefault obj=new DataTypeDemoDefault();
			
			System.out.println("Byte value is :" +obj.b);
			System.out.println("Short value is :" +obj.s);
			System.out.println("Integer value is :" +obj.x);
			System.out.println("Long value is :" +obj.d);
			System.out.println("Float value is :" +obj.f);
			System.out.println("Double value is :" +obj.d);
			System.out.println("Boolean value is :" +obj.bc);
			System.out.println("Character value is :" +obj.c);
			System.out.println("String value is :" +name);
			
			
			System.out.println("*********************************");
			
			
			System.out.println("Byte value is :" +DataTypeDemoDefault.b1);
			System.out.println("Short value is :" +DataTypeDemoDefault.s1);
			System.out.println("Integer value is :" +DataTypeDemoDefault.x1);
			System.out.println("Long value is :" +DataTypeDemoDefault.d1);
			System.out.println("Float value is :" +DataTypeDemoDefault.f1);
			System.out.println("Double value is :" +DataTypeDemoDefault.d1);
			System.out.println("Boolean value is :" +DataTypeDemoDefault.bc1);
			System.out.println("Character value is :" +DataTypeDemoDefault.c1);
			System.out.println("String value is :" +DataTypeDemoDefault.name1);

		}

	}
