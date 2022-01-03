package icici.loan.carloan;

public interface Rbi {
	
	
	// Interface : Interface is nothing but hiding implementation details to user and exposing the services names  is called interface
	// Interface contains data properties and behaviors( abstract  behaviors) and we can't create object for interface 
	// we will implement unimplement methods in child class implementation
	int x=10;
	
	// Abstract behavior(method) is allowed but does not allow the body { }
	
	// Class: When requirements fixed(know) we will go to class[contrite behavior]
	//Interface :The requirements are dynamic vendor to vendor  we will go with interface 
	
	public void withdrawl();
	public void depposit();


 public static void main(String[] args) {
	
	 Rbi i;
	 
	 i=new ICICI();
	 i.withdrawl();
	 i.depposit();
	 
	 i=new HDFC();
	 i.withdrawl();
	 i.depposit();
	 
 }
 
}