package icici.loan.eduloan;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		// byte , short , int, long, float, double, char , boolean
		
		// 1- Liter bottle  ---> 500 ML ---> There is no risk -->widening
		//1-Liter bottle  --->1.5 Liter --->There is a risk (overflow) --->Narrowing
		
		
		// No data lose
		int x=10;
		System.out.println("Primitive Integer Value is: " +x);
		double i=x;
		System.out.println("Primitive Double Value is: " +i);
		
		// With Data lose
		
		double d=10.7;
		System.out.println("Primitive Double Value is: " +d);
		int y=(int) d;
		System.out.println("Primitive Integer Value is: " +y);
		
		System.out.println("*****************************");
		
		int bj=65;
		System.out.println("Primitive Integer Value is: " +bj);
		char ch=(char) bj;
		System.out.println("Primitive Character Value is: " +ch);

	}

}
