package icici.loan.homeloan;

class Animal
{
	public void instanceMethod()
	{
		System.out.println("Instance Method in Animal"); // Overridden
	}
	public static void staticMethod()
	{
		System.out.println("Static Method in Animal");
	}
}
public class Dog extends Animal{
	
	public void instanceMethod()
	{
		System.out.println("Instance Method in Dog"); // Override
	}
	public static void staticMethod()
	{
		System.out.println("Static Method in Dog"); // Hiding
		
	}

	public static void main(String[] args) {
		
		Animal a,a1;
		
		 a=new Dog();
		a.instanceMethod();
		Dog.staticMethod();
		a.staticMethod();
		a1=new Dog();
		a1.staticMethod();
		a1.instanceMethod();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
	}
}
