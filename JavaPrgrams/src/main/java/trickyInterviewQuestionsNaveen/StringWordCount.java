package trickyInterviewQuestionsNaveen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordCount {
	
//Get the count of total words in a given capitalized string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" thisPanduAutomationLabsYoutubeTestingJavapop";
		
		// if small char word string is at the beginning
		int c=0;
		if(Character.isLowerCase(str.trim().charAt(0)))
		{
			c++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				c++;
			}
		}
		System.out.println(c);
		
		// 1.
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
        //2.
		
		int count1 =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 &&str.charAt(i)<=90)
			{
				count1++;
			}
		}
		System.out.println(count1);
		//3.
		int count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				count2++;
			}
		}
		System.out.println(count2);
		
		//4. Streams
		
		long count4=str.chars().filter(e->e>=65 && e<=90).count();
		System.out.println(count4);
		
		//5.
		long count5=str.chars().filter(e->Character.isUpperCase(e)).count();
		System.out.println(count5);
		// 6.
		
		String reg="[A-Z]+";
		Pattern pattern=Pattern.compile(reg);
		Matcher matcher=pattern.matcher(str);
		int count6=0;
		while(matcher.find())
		{
			count6+=matcher.group(0).length();
		}
		System.out.println(count6);
	}

}
