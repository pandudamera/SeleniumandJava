package icici.loan.eduloan;

public class WhileProgram {

	public static void main(String[] args) {

    int a = 0;
    while(a<=10)
    {
    	System.out.println("While code:" +a);
    	a++;
    }
    
    int sum=0;
    for(int i=1;i<=5;i++)
    {
      sum=i+sum;	
    }
    
    System.out.println("Sum of first 5 natural numbers:" +sum); //1+2+3+4+5=15
		
	}
	
	{
	int x=10;
	do
	{
		System.out.println("Do While code:" +x);
		x++;
	} while (x<=10);
}


}
