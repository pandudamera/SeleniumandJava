package trickyInterviewQuestionsNaveen;

public class StaticBlockQuestions9 {

	//Q9. What Will the be the output of executing following class? 
			static
			{
				System.out.println("Static Block");
			}
			{
			System.out.println("Instace instilatization Block");
			}
			
			StaticBlockQuestions9()
			{
				System.out.println("Constructor");
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 System.out.println("Main Method");
	 new StaticBlockQuestions9();
		}

	}