package trickyInterviewQuestionsNaveen;

public class StaticBlockQuestions3 {
	static
	{
		System.out.println("Static Block1");
	}
	
	public static void test()
	{
		System.out.println("Static Test Method");
	}
	public static void cover()
	{
		System.out.println("Static Cover Method");
		test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method");
		test();
		StaticBlockQuestions2.test();
		cover();

	}

}
