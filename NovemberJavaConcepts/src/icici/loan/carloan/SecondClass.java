package icici.loan.carloan;



public class SecondClass {
	
	// Class : collection of data properties and behaviors are called class 
	
	// Data Properties 
	int a=10, b=10,result;
	
	public void add() // Behaviors 
	{
		result=a+b;
		System.out.println("Add of A & B is : " +result);
	}
	
	public void sub()
	{ // Contritiy behavior 
		result=a-b;
		System.out.println("Subtraction of A & B is : " +result);
	}
	public void mul()
	{
		result=a*b;
		System.out.println("Multiplication of A & B is : " +result);
	}

	public static void main(String[] args) {
		
		
		System.out.println("Hello How are are you:?");
		
		//int x=100;
		 //String name="Pandu";
		 
		 
		 SecondClass obj=new SecondClass(); // Instance of class is called Object or Collection of classes is called Object
		 obj.add();
		 obj.sub();
		 obj.mul();
		
		
	}
	
	
}
