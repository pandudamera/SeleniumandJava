package trickyInterviewQuestionsNaveen;

public class TestNum {

	// Compare two int numbers(integer caching)
	//-128 to 127
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer num1=100; //equal
		//Integer num2=100; //equal-Auto boxing
		Integer num1=-128; //equal
		Integer num2=-128;
		
		//Integer num1=197;
		//Integer num2=197;
				
		
		if(num1==num2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}

	}

}
