package icici.loan.homeloan;

public class CloneableTest implements Cloneable
{
 int a=10, b=20;
 
 public static void main(String[] args) throws CloneNotSupportedException {
	
	 CloneableTest c=new CloneableTest();
	 CloneableTest c1=(CloneableTest)c.clone();
	 System.out.println(c.a);
	 System.out.println(c.b);
	 c1.b=555;
	 c1.a=444;
	 System.out.println(c.a);
	 c1.b=333;
	 System.out.println(c.a);
	 System.out.println(c.b);
	 System.out.println(c1.a);
	 System.out.println(c1.b);
}
	
	
}
