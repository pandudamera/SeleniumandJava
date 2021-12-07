package icici.loan.eduloan;

public class CallByValue {

	int a,b;
	private static void add(int s, int t)
	{
		 s=10;
		System.out.println("Result from method Addition: " +(s+t));
	}
	
	public static void main(String[] args) {
		
		CallByValue op=new CallByValue();
		op.a=2 ;
		op.b=3;
		
		System.out.println("Before Passing: " +(op.a+op.b));
		add(op.a,op.b);
		System.out.println("After Passing: " +(op.a+op.b));
		
	}
}
