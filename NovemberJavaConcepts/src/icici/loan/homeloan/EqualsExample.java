package icici.loan.homeloan;

public class EqualsExample {

	public EqualsExample(String str)
	{
		
	}
	
	public static void main(String[] args) {


		EqualsExample e=new EqualsExample("Pandu");
		EqualsExample e1=new EqualsExample("Pandu");
		
		System.out.println(e==e1); // Reference Type Comparison 
		System.out.println(e.equals(e1)); // Reference Type Comparison 
		
		String str="Shashi";
		String str1="Shashi";
		System.out.println(str==str1); // Reference Type Comparison 
		System.out.println(str.equals(str1)); // Content Type Comparison 
		
		String str2=new String("Damera");
		String str3=new String("Damera");
		System.out.println(str2==str3); // Reference Type Comparison 
		System.out.println(str2.equals(str3)); // Content Type Comparison 
		
		StringBuffer str4=new StringBuffer("Damera");
		StringBuffer str5=new StringBuffer("Damera");
		System.out.println(str4==str5); // Reference Type Comparison 
		System.out.println(str4.equals(str5)); // Reference Type Comparison 

	}

}
