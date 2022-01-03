package icici.loan.carloan;

public abstract class FirstAbtract {
	
	int x=100;
	
	// Abstract Class: // The requirements are dynamic vendor to vendor  we will go with abstract class
	//Class : When requirements is fixed(know) we will go to class[cortitiy behavior] and 
     
		
	
	public void m1()
	{
		System.out.println("I am m1 concrete from firstabtract:");
	}

	public abstract void m2();
	
	public static void main(String[] args) {
		
		FirstAbtract ob=new ChildClass();
		ob.m1(); // It will call child class in runtime 
		ob.m2();
	

		
	}

}
