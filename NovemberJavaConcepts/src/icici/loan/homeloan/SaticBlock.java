package icici.loan.homeloan;

public class SaticBlock {
	
	static int eid=10;
	
	static 
	{
		System.out.println("Static block-1 logics");
	}

	static 
	{
		eid=111;
	}
	public static void assign()
	{
		eid=333;
	}
	
	public static void display()
	{
		System.out.println(eid);
	}
	
	public static void main(String[] args) {
		SaticBlock s=new SaticBlock();
		s.assign();
		s.display();
		

	}

}
