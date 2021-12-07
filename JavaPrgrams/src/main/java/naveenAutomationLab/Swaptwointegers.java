package naveenAutomationLab;

public class Swaptwointegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5; //0101
		int y=10; //1010
		int t;
		//1. Using 3 variable
		t=x;
		x=y;
		y=t;
		
		//2. Without using 3 variable :Using + operator 
		x=x+y;
		y=x-y;
		x=x-y;
		
		//3. Without using 3 variable :Using * operator
		x=x*y;
		y=x/y;
		x=x/y;
		
		//4. Without using 3 variable :Using XOR operator
		x=x^y; //15---->1111
		y=x^y;  //10--->1010
		x=x^y;  //5---->0101
		System.out.println(x);
		System.out.println(y);
		
				
		

	}

}
