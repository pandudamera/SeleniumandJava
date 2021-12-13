package icici.loan.homeloan;

import java.util.StringTokenizer;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str="Pandu";
		System.out.println(str.charAt(2));
		char ch="Damera".charAt(2);
		//System.out.println(str.intern());
		System.out.println(ch);
		String st="Hi Pandu How are you?";
		String[] s=st.split(" ");
		for(String st1:s)
	
	{
		System.out.println(st1);
	
	}
		
		String st2="              Damera          ";
		System.out.println(st2.length());
		System.out.println(st2.trim());
		System.out.println(st2.trim());
		
		StringBuffer sb=new StringBuffer("madam");
		System.out.println("String Reverse:" +sb.reverse());
		
		String str3="Hi Pandu How are you? Where are u from?";
		StringTokenizer stn=new StringTokenizer(str3);
		while(stn.hasMoreElements())
		{
			System.out.println(stn.nextElement());
			
			/*String b=String.valueOf("Pandu");
			System.out.println(b);*/
			
		}
			

}
}