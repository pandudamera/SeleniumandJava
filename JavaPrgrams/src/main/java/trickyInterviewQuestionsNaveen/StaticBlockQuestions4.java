package trickyInterviewQuestionsNaveen;

public class StaticBlockQuestions4 {
//Q4. How can we create objects if we make the constructor private ? 
	
	int age;
	
	static
	{
		StaticBlockQuestions4 a2= new StaticBlockQuestions4();
	}
	public static int createMethod()
	{
		StaticBlockQuestions4 a3= new StaticBlockQuestions4();
		a3.age=40;
		return a3.age;
	}
	private StaticBlockQuestions4()
	{
		age=30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockQuestions4 a= new StaticBlockQuestions4();
		System.out.println(a.age);

	}

}
