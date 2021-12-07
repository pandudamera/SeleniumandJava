package pavanSdet;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("Swape before swapping two numbers::" +a+" " +b);
		//Logic 1-Third Variable
		/*int t=b;
		a=b;
		b=t;
		System.out.println("Swape After swapping two numbers::" +a+" " +b);
		//Logic 2-Use +& -Without using third variable
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30=10=20*/		
		//Logic 3-Use * and / without using third variable 
		//here a & b values should not be zero
		/*
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		//Logic 4-Use Bitwise XOR
		/*
		a=a^b; //10^20=30
		b=a^b; //30^20=10 
		a=a^b; //30^10=20 */
		
		//Logic 5-single Statement 
		b=a+b-(a=b);
		
		System.out.println("Swape After swapping two numbers::" +a+" " +b);
		

	}

}
