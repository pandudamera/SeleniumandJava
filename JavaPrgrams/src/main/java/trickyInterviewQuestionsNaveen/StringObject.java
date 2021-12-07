package trickyInterviewQuestionsNaveen;

public class StringObject {
	
	/* How many object are you create*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello World";
		String s2="Hello World";
		String s3=s1;
		String n1=new String("Hello World");
		String n2=new String("Hello World");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(n1==n2);
		System.out.println(s1==n2);

	}

}
