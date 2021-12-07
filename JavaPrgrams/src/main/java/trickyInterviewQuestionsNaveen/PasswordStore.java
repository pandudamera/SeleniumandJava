package trickyInterviewQuestionsNaveen;

import java.util.Arrays;

public class PasswordStore {

	// Why should be stored in char array char[] instead of string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="PanduDamera123";
		System.out.println("Password Stored:" +str);
		char c[]=new char[] {'p','a','n','d','u','1','2','3'};
		System.out.println("Password Strored:" +c);
		Arrays.fill(c, '*');
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}

	}

}
