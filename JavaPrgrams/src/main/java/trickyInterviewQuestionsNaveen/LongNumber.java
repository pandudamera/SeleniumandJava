package trickyInterviewQuestionsNaveen;

public class LongNumber {

	/* What will e the output when you use a long number with L and without  L suffix?*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long longNumberWithoutL=1000*60*60*24*365;
		long longNumberWithL=1000*60*60*24*365L;
		System.out.println(longNumberWithoutL); //1471228928
		System.out.println(longNumberWithL); //31536000000-36 bit
	}

}
