package icici.loan.eduloan;

public class BreakProgram {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				//break; // 0,1,2,3,4
				continue; // actual value 5 is not print remaining value print
			}System.out.println(i);
		}
	}
}
