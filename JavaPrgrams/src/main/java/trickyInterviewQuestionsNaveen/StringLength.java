package trickyInterviewQuestionsNaveen;

public class StringLength {
	
	// how to find length of string in java without using length method?  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 Approach
		System.out.println("String Length 1th Approach");
		String str="testing";
		//System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));

//2 Approach 	
		System.out.println("String Length 2th Approach");
		int l= new StringBuilder(str).length();
		System.out.println(l);
		
		//3.Approach 
		System.out.println("String Length 3th Approach");
		int count=0;
		for(char c:str.toCharArray())
		{
			count++;
		}
			System.out.println(count);
		 System.out.println(getLenght("Testing World"));
		 
		 System.out.println(getStringLenght("Testing World Sucess")); 
		//5. Approach
			System.out.println("String Length 5th Approach");
			int l1=0;
			try {
				l1=str.getBytes("UTF-16BE").length/2;
			}
			catch(Exception e)
			{
				
			}
			System.out.println(l1);
		}

	
	// 4. Approach
	
	public static int getLenght(String str)
	{
		System.out.println("String Length 4th Approach");
		int i=0;
		try {
			while(true)
			{
				str.charAt(i);
				i++;
			}
		}
		catch(IndexOutOfBoundsException e)
		{
		 return i;	
		}
	
		}
	
	public static int getStringLenght(String str)
	{
		System.out.println("String Length 6th Approach");
		String st[]=str.split("");
		int count=0;
		for(String s: st)
		{
			count +=s.toCharArray().length; 
		}
		
		return count;
	}
}


