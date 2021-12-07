package trickyInterviewQuestionsNaveen;

public class AlphabetPattern {
	
	/* Printing the Alphabet Pattern */
/* A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha=65;
		//A-65
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j) + " ");
			}
			System.out.println();
			
		}
		

	}

}
