package trickyInterviewQuestionsNaveen;

public class NullArgument {

	// Pass null argument with method overloading with string and object types
	public static void main(Object o) {
		System.out.println("Object Aruguments");

	}
	public static void test(String str) {
		System.out.println("String Aruguments");

	}
	/*public static void test(StringBuffer  str) {
		System.out.println("StringBuffer Aruguments");

	}
	public static void tests(StringBuilder  str) {
		System.out.println("StringBuilder Aruguments");
	}*/
	
	public static void main(String[] args) 
	{
		test(null);
	}

}
