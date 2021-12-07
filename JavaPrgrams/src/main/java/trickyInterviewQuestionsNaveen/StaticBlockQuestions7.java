package trickyInterviewQuestionsNaveen;

class  Demo {
	//Q7. Will the static block be executed in the following code? why? 
	static
	{
		System.out.println("Static Block1");
	}
	
	public static final int x=10;
}

public class StaticBlockQuestions7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(Demo.x);
	}
}
