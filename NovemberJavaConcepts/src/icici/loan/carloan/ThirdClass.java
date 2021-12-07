package icici.loan.carloan;

public class ThirdClass {

	// Class : Class is template or plan or blueprint is called class 
	
	// Data Properties 
	// 30 or 10 are integer objects 
	// x is variable 
	// int is data type
	
		int a=30, b=10,result;
		
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
	
	public static void main(String[] args) {
		
		ThirdClass obj=new ThirdClass(); // Instance of class is called Object or Collection of classes is called Object
		 obj.add();
		 obj.sub();

	}

}
