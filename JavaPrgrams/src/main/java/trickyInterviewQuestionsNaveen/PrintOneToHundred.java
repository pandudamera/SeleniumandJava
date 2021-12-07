package trickyInterviewQuestionsNaveen;

public class PrintOneToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output numbers from 1....100 without using any numbers in code
		int one='A'/'A';
		String s=".......";
		// first Solution
		for(int i=one;i<=(s.length()*s.length());i++)
		{
			System.out.println(i);
		}
		//Second Solution
		//a-97 b-98 c-99 d 100
		for(int i=one;i<='d';i+=one)
		{
			System.out.println(i);
		}

	}

}
