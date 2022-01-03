package naveenAutomationLab;

public class Reversenterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1234;
		long rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse Number is::" +rev);
		//2.Approch
		long n=5678;
		
		StringBuffer sb=new StringBuffer("5678");
		StringBuffer m=sb.reverse();
		System.out.println(m);
		//System.out.println(new StringBuffer(String.valueOf(n)).reverse());
		

	}

}
