package icici.loan.eduloan;

public class Child1 extends Child{
	

	public void m8()
	
	{
		System.out.println("I am m8 method C class:");
	}

	public static void main(String[] args) {
		

		Parent ob=new Parent();
		ob.m6(); // HASA Relationship
		
		Child1 obj=new Child1();
		obj.m6();
		obj.m7();
		obj.m8();
	}

}


