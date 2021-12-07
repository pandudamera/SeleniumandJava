package icici.loan.eduloan;


class Animal
{
	static void run1()
	{
		System.out.println("Hiding Animal is running");
	}
	void run2()
	{
		System.out.println("Overriding Animal is running");
	}
}
class Chetah extends Animal
{
	static void run1()
	{
		System.out.println("Hiding is Fastly");
	}
	void run2()
	{
		System.out.println("Overriding Animal is Fastly");
	}
}
public class MethodHidding {
	
	public static void main(String[] args) {
		
		Animal obj=new Chetah();
		obj.run1();
		obj.run2();
		
		Animal obj1=new Animal();
		obj1.run1();//Hiding
		obj1.run2();//Overriding
		
		Chetah obj2=new Chetah();
		obj2.run1();
		obj2.run2();
		
	}

}
