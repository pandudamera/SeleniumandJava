package icici.loan.homeloan;

public class VarArgument {
	
	public static void m1(int... a)
	{
		System.out.println("Pandu Damera:" +a);
	}

	public static void main(String[] args) {
		
		VarArgument v=new VarArgument();
		v.m1();
		v.m1(10);
		v.m1(10,20);
		v.m1(10,20,30);
		v.m1(10,20,30,40);

	}

}
