package stringsInterviewQuestions;

public class StringPalindrome {

	// Java program to check whether a string a palindrome or not  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		int start=0; //2
		int end=str.length()-1; //2
		boolean isPalindrome=true;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
			 isPalindrome=false;
			 break;
			}
			start++;
			end--;
		}
   if(isPalindrome)
   {
	   System.out.println("Is Palindrome");
   }
   else
   {
	   System.out.println("Is not Palindrome");
   }
	}

}
