package icici.loan.eduloan;

public class DataTypesDemo {
	
	float cb=30; // Implicitly conversion 
	float df=90.89f;
	int gh=(int)df; // Explicitly conversion
	
	
	// integer types
	byte b=127; //1 byte
	short s=-32768; // 2 bytes
	int x=2147483647;// 4 bytes
	long i=2147483647; // 8 bytes
	
	// floating type
	
	float f=12.34f; // 4 bytes
	double d=23.34; // 8 bytes
   
	boolean bc=true;
	char c='c'; //2 bytes
	
	static String name="Pandu";
	
	public static void main(String[] args) {
		
		DataTypesDemo obj=new DataTypesDemo();
		
		System.out.println("Byte value is :" +obj.b);
		System.out.println("Short value is :" +obj.s);
		System.out.println("Integer value is :" +obj.x);
		System.out.println("Long value is :" +obj.d);
		System.out.println("Float value is :" +obj.f);
		System.out.println("Double value is :" +obj.d);
		System.out.println("Boolean value is :" +obj.bc);
		System.out.println("Character value is :" +obj.c);
		System.out.println("String value is :" +name);

	}

}
