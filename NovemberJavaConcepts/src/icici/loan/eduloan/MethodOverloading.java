package icici.loan.eduloan;

public class MethodOverloading {
	
	public static int add(int a , int b)
	{
		System.out.println("Addition:" +(a+b));
		return a+b;
	}
	
	public static int add(int a , int b, int c,float d,double e)
	{
		System.out.println("Addition:" +(a+b+c+d+e));
		return a+b+c;
	}
	
	public static String add(String str)
	{
		System.out.println("String Class:" +str);
		return str;
	}
	public static void main(String[] args) {
		
		System.out.println(add(10, 5));
		System.out.println(add(10, 5, 3,2.56f,1));
		System.out.println(add("Pandu"));
		
	}

}
