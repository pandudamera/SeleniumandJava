package icici.loan.homeloan;

public class StaticBlock {
	static
	{
	System.out.println("Static Block Programming");
	}
	

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c=Class.forName("Demo");
		Demo d=(Demo)c.newInstance();
		d.m1();

	}

}
