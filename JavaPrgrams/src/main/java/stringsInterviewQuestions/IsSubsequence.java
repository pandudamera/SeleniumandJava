package stringsInterviewQuestions;

public class IsSubsequence {
	
	public static boolean isSubsequence(String str1, String str2)
	{
		if(str1.length()==0)
			return true;
		int i=0;
		int j=0;
		while(i<str1.length()&&j<str2.length())
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				i++;
			}
			if(str1.length()==i)
			{
				return true;
			}
			j++;
		}
		return  false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=isSubsequence("ade", "abcdefgh");
		System.out.println(result);

	}

}
