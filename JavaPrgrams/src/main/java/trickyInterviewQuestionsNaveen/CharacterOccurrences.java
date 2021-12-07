package trickyInterviewQuestionsNaveen;

public class CharacterOccurrences {
	
	/* Count  Occurrences of a Character in string */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//o-2
		//I-1
		//CharArray -For Loop
		//str.len-charAt(i)
		//Apache common StringUtilities
		//Stream
		
		String str="I love coding and tesing";
		//getCharCount(str,'g');
		//getCharCount(str,'i');
		long count=str.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals("i")).count();
		System.out.println(count);
	}
	public static void getCharCount(String str, char val)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		if(str.charAt(i)==val)	
		{
				count ++;
			}
		}
		

	
	
		
	}


