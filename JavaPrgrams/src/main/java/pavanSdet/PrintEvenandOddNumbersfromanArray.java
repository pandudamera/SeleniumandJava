package pavanSdet;

public class PrintEvenandOddNumbersfromanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("Is A Even Number::"+value);
			}
			else
			{
			System.out.println("Is A Odd Number::"+value);
			}
		}

	}

}
