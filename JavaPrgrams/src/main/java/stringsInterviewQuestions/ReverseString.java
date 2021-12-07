package stringsInterviewQuestions;

public class ReverseString {

	private static String reverse(String str)
	{
		//Terminating condition
		if(str==null||str.length()<=1)
		{
			return str;
		}
		
		// Recursive call
		 return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="Object";
 String revStr=reverse(str);
 System.out.println(revStr);
	}

}
