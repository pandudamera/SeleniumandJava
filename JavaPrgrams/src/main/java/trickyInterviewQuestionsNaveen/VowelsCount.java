package trickyInterviewQuestionsNaveen;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelsCount {
	/* Total number of vowels within a java string using
	 * java, java 8 and Google guava techniques.
	 * aeious
	 * 
	 * 
	 * */
// Java :
	public static boolean isVowel(char t)
	{
		return t=='a' || t=='e' || t=='i' || t=='o'||t=='u'||
			   t=='A' || t=='E' || t=='I' || t=='O'||t=='U';
				
	}
	
	
	
	public static void main(String[] args) {
		
		String str="aeiousAEIOUS";
		int count =0;
		for(int x=0;x<str.length();x++)
		{
        if(isVowel(str.charAt(x))) 	
        {
        	count++;
        }

	}
	System.out.println(count);
	// Java 8 Streams
	System.out.println("Using Java 8 Streams");
	IntPredicate vowel=new IntPredicate() {
		
		@Override
		public boolean test(int t) {
			
			return t=='a' || t=='e' || t=='i' || t=='o'||t=='u'||
					   t=='A' || t=='E' || t=='I' || t=='O'||t=='U';
		}
	};
	
	String test="aeiou";
	long count1=test.chars().filter(vowel).count();
	System.out.println(count1);
	
	// Using Google Guava
	//https://mvnrepository.com/artifact/com.google.guava/guava/30.1.1-jre
	System.out.println("Using Google Guava Library Vowels");
	String st="aeiousAEIOU";
	int vocount=CharMatcher.anyOf("aeiouAEIOU").countIn(st);
	System.out.println(vocount);
}
}
