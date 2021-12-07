package icici.loan.eduloan;

public class Tables {
	
	public static int mul(int x) // Parameters , Formal Parameters
	{
		System.out.println("Multiplication:" +(5*x));
		return 5*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			mul(i); // Arguments actual parameters
		}

	}

}
