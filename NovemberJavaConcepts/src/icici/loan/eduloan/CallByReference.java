package icici.loan.eduloan;

public class CallByReference {

	int a;
	int b;
	private static void add(CallByReference op, CallByReference op1)
	{
		 op.a=10;
		System.out.println("Result from method Addition: " +(op.a+op.b));
	}
	
	public static void main(String[] args) {
		
		CallByReference op=new CallByReference();
		CallByReference op1=new CallByReference();
		op.a=2 ;
		op.b=3;
		
		System.out.println("Before Passing: " +(op.a+op.b));
		add(op,op1); // Call method
		System.out.println("After Passing: " +(op.a+op1.b));

	}

}
