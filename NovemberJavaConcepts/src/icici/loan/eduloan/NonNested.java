package icici.loan.eduloan;

class Outer
{
	void print()
	{
		System.out.println("I am outer");
	}
}
public class NonNested {
	
	void printName()
	{
		System.out.println("I am Non Nested Class");
	}

	public static void main(String[] args) {
		
		NonNested obj=new NonNested();
		Outer obj1=new Outer();
		obj.printName();
		obj1.print();
	}

}
