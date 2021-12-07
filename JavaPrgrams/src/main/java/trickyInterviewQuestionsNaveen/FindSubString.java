package trickyInterviewQuestionsNaveen;

public class FindSubString {

	// Check substring is present in a given string
	
	//1.
	public static boolean isSubstring(String main, String sub)
	{
		return main.matches("(.*)" + sub + "(.*)");
	}
	
	//2.
	public static boolean isSubstring1(String main, String sub)
	{
		return main.contains(sub);
	}
	//3.
	public static boolean isSubstring2(String main, String sub)
	{
		return main.indexOf(sub)!=-1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***************************");
		System.out.println(isSubstring1("pandu automation labs", "labs"));
		System.out.println(isSubstring1("pandu automation labs", "pandu"));
		System.out.println(isSubstring1("pandu automation labs", "testing"));
		
		System.out.println("***************************");
		System.out.println(isSubstring2("pandu automation labs", "labs"));
		System.out.println(isSubstring2("pandu automation labs", "pandu"));
		System.out.println(isSubstring2("pandu automation labs", "testing"));
		
		System.out.println("***************************");
		System.out.println(isSubstring("pandu automation labs", "labs"));
		System.out.println(isSubstring("pandu automation labs", "pandu"));
		System.out.println(isSubstring("pandu automation labs", "testing"));
		System.out.println(isSubstring("pandu automation labs $$ special", "$$"));
		System.out.println(isSubstring("pandu automation labs", "labs"));
		System.out.println(isSubstring("automation", "auto"));
		System.out.println(isSubstring("automation", "test"));
		System.out.println(isSubstring("automation", "ti"));
		System.out.println(isSubstring("automation", "a"));
		System.out.println(isSubstring("automation11", "11"));
		System.out.println(isSubstring("automation11", "1"));
		System.out.println(isSubstring("automation11", null));
		System.out.println(isSubstring("automation labs", " "));
		System.out.println(isSubstring("automation labs", "  "));

	}

}
