package stringsInterviewQuestions;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java Promamming";
		String [] words=str.split(" ");
		String revString="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revWord="";
			
			//Java
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j); //avaj
			}
			revString=revString+revWord+" "; //avaJ gnimmamorP 
		}
		System.out.println(revString);

	}

}
