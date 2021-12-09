package icici.loan.homeloan;

class SuperClass
{
	public SuperClass()
	{
		System.out.println("Parent 0-arg contructor logics");
	}
}


public class ChildClass extends Parent
{
	public ChildClass()
	{
		this(10);
		System.out.println("Child 0-arg contructor logics");
		
	}
	public ChildClass(int a)
	{
		super();
		System.out.println("Child 1-arg contructor logics:" +a);
		
	}


	public static void main(String[] args) {
		new ChildClass();

	}

}
