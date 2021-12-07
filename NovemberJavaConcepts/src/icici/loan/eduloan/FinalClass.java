package icici.loan.eduloan;


class F
{
	 void run()
	{
		System.out.println("I am Final Parent method");
	}
}
public class FinalClass extends F {
	
	final int a=10;

	 void run()
	{
		System.out.println("I am Final Child method");
	}
	public static void main(String[] args) {
		
		FinalClass obj=new FinalClass();
		//obj.a=20;
		//System.out.println(f.a);
		obj.run();
		
	}
}
