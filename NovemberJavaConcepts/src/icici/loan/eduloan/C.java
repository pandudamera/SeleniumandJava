package icici.loan.eduloan;

import icici.loan.carloan.A;

public class C extends A {

	public void m3()
	{
		System.out.println("I am m3 method C class:");
	}

	public void m4()
	{
		System.out.println("I am m4 method C class:");
	}
	/*public void m1()
	{
		System.out.println("I am m1 overriding method C class:");
	}
*/
	public static void main(String[] args) {
		
		A o = new A();
		o.m1();

		C o1 = new C();
		o1.m3();
		o1.m1();
		A ob = new C();
		ob.m1();

		C b = (C)ob;
		b.m1();
		b.m3();
		b.m4();
	 
	 //ob.m3();
	 

	}

}
