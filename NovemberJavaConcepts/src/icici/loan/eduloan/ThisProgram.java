package icici.loan.eduloan;

public class ThisProgram {
	
	
	// 1. This can be used to refer current class instance variable
	// 2. This can be used to invoke current class method (Implicitly)
	// 3. This can be used to invoke current class constructor 
	// 4. This can be passed as an argument in the method call 
	// 5. This can be passed as an argument in the constructor call
	// 6. This can be used to return the current class instance from the method
	
	String n;
	
	public ThisProgram()
	{
		System.out.println("Hi");
	}
	public ThisProgram(int a)
	{
		this();
		System.out.println(a);
	}
	
	public ThisProgram(String n)
	{
		this.n=n;
	}
	
	public void m1()
	{
		//System.out.println("I am m1 method:" +n);
		this.m2();
		System.out.println("I am m1 method:" +n);
	}
	public void m2()
	{
		System.out.println("I am m2 method:");
	}
	
	public void m3(ThisProgram obj)
	{
		System.out.println("Invoked");
	}
	public void m4()
	{
		m3(this);
	}
	public static void main(String[] args) {
		
		ThisProgram obj=new ThisProgram();
		obj.m4();
		ThisProgram obj2=new ThisProgram(10);
		
		ThisProgram obj1=new ThisProgram("Pandu");
		obj1.m1(); 
		
	}

}
