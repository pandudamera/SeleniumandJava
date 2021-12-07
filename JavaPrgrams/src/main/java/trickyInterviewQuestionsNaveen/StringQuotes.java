package trickyInterviewQuestionsNaveen;

public class StringQuotes {

	/*
	 *  /"Hello"/
	 *  /'Hello'/
	 *  "Hello"
	 *   I love "java" and "programming" and "movies"
	 *   'I love "java" and "programming" and "movies"'
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("/\"Hello\"/");
		System.out.println("\"\'Hello'/\"");
        System.out.println("\"Hello\"");
        System.out.println("I love \"java\" and \"programming\" and \"movies\"");
        System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");
        
        System.out.println(getXpath("Pandu"));
        System.out.println(getXpath("Testing"));
        System.out.println(getXpath("123"));
	}
	
	public static String getXpath(String name)
	{
		String xpath="//input[@id='"+name+"']";
		
		return xpath;
	}

}
