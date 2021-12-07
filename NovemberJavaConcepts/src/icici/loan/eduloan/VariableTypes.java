package icici.loan.eduloan;

public class VariableTypes {
	
	// Primitive Variable
	int x=100; // Instance or Non Static or Global
	
	static String name ="Vmware"; //Static or global static
	static float roi=8.9f;
	static VariableTypes ob; //object reference 
	
	public void m1()
	{
		
		int x=90; // Local Variable
		System.out.println(x);// Local variable with the method or class we can access 
		System.out.println(this.x);
	}
	
	public static void m2()
	{
		 ob=new VariableTypes(); 
		System.out.println(ob.x);
		System.out.println(VariableTypes.name);
		System.out.println("I am static method m2 : ");
	}
	public static void main(String[] args) {
		
		 ob=new VariableTypes(); //Non Primitive or Reference Variable
		
		System.out.println("Integer value is :" +ob.x);
		System.out.println("String value is :" +VariableTypes.name);
		
		
		
		
		



	}

}
