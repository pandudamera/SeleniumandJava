package trickyInterviewQuestionsNaveen;

public class CharaOccurenceCountStream {

	// Count the number of occurrences of a give character in string using java 8 streams 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Testing solutions via naveen automation lab";
	//	long count=str
		//		.chars()
		//		.filter(e -> (char) e == 's' || (char) e == 'i')
			//	.count();
		
    //System.out.println(count);
		System.out.println(getCharCount(str, 's'));
	}

	public static long getCharCount(String str, char c)
	{
		return str
		 .chars()
		 .filter(e -> (char) e == c)
		 .count();
	}
}
