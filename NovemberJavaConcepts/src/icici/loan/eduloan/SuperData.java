package icici.loan.eduloan;

 class Device {
	 
	 // 1.Super can be used to refer immediate parent class instance variable (Methods or instance variable or constructor are same we can use super keyword)
	 //2. Super can be used to invoke immediate parent class method(Both are same parent as well child class methods)
	 //3. Super can be used to invoke immediate parent class constructor(Both are same parent as well child class constructor)
	
	 String n="ng";
	 
	 void display()
	{
		// System.out.println(n);
		System.out.println("I am eletronic device: ");
	}
	 Device()
	 {
		 System.out.println("I am Parent class constructor");
	 }
 }
	 class Tv extends Device
	{
		 String n="Sony";
		 void display()
		{
		   System.out.println(super.n);
		   System.out.println(n);
			System.out.println("I am TV device: ");
			super.display();
		}
		 Tv()
		 {
			 super();
			 System.out.println("I am Child class constructor");
		 }
	}
public class SuperData
{
	public static void main(String[] args) 
	{
		
		Tv ob=new Tv();
		ob.display();
	}
}
