package icici.loan.homeloan;

class Parent {
	
	public void m1()
	{
		System.out.println("Parent m1() method:");
	}
}
public class Child extends Parent
{
	public void m1()
	{
		System.out.println("Child m1() method:");
	}
	public void m3()
	{
		this.m1();
		super.m1();
	}

	public static void main(String[] args) {
		
		new Child().m3();

	}

}
