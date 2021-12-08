package icici.loan.eduloan;

public class EmployeeParent {
	
	int eno;
	String ename;
	float sal;
	
	public EmployeeParent() 
	
	{ 
	 System.out.println("iam default constructor..."); 
	 System.out.println(this.eno); 
	 System.out.println(this.ename);
	  System.out.println(this.sal);
	  }
	 
	
	public EmployeeParent(int eno)
	{
		//this();
		this.eno = eno;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public EmployeeParent(int eno, String ename) 
	{
		this(eno);
		this.eno=eno;
		this.ename=ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public EmployeeParent(int eno, String ename, float sal) 
	{
		this(eno,ename);
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public static void main(String[] args)
	{
		EmployeeParent e4 = new EmployeeParent(1746,"Damera", 12.34f);
	}

}