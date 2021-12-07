package naveenAutomationLab;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The Rain Have Started Here";
		String s2="The Rain Have Started Here";
		System.out.println("String Length is::" +s1.length());
		System.out.println("String CharAt is::" +s1.charAt(5));
		System.out.println("String Index is::" +s1.indexOf('s'));
		System.out.println("String Index is::" +s1.indexOf('s', s1.indexOf('s')+1));
		System.out.println("String Index is::" +s1.indexOf("Have"));
		System.out.println("String Length is::" +s1.indexOf("Hello"));
		//String Comparison
		System.out.println("String Equals is::" +s1.equals(s2));
		System.out.println("String Equals Ignore Case is::" +s1.equalsIgnoreCase(s2));
		//SubString
		System.out.println("String Substring is::" +s1.substring(0,9));
		
		//Trim
		String s3="      Hello How are you?";
		System.out.println("String Trim is::" +s3.trim());
		
		//Replace
		System.out.println("String Replace is::" +s1.replace(" ", " "));
		
		String date="04-08-2020";
		System.out.println("String Date is::" +date.replace("-", "/"));
		
		//Split
		String split="Hello_Testing_Selenium";
		String st[]=split.split("_");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		String s4="Damera";
		String s5="Shashi";
		String s6=s4+s5;
		int x=10;
		int y=20;
		System.out.println("String Concate is::" +s4.concat(s5));
		System.out.println("String Concate is::" +s6);
		System.out.println(x+y);
		System.out.println(x+y+s4+s5);
		System.out.println(s4+s5+x+y);
		System.out.println(x+y+(s4+s5));
	}

}
