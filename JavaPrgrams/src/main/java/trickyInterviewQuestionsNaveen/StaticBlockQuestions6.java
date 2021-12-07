package trickyInterviewQuestionsNaveen;

public class StaticBlockQuestions6 {
	
	String name;
	static int age;
	
	static
	{
		StaticBlockQuestions6 n=new StaticBlockQuestions6();
		n.name="Pandu";
		age=50;
		
		System.out.println(n.name +" " + age);
	}
	public static void main(String[] args) {
		
	}
}
