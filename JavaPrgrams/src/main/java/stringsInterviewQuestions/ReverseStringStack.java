package stringsInterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		System.out.println("Reverse of a String");
		
		while(!stack.empty())
		{
			System.out.print(stack.pop());
		}

	}

}
