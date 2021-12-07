package naveenAutomationLab;

public class SwaptwoStringswithoutusingtempthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		System.out.println("Before Swapping::");
		System.out.println("The Value of a is::" +a);
		System.out.println("The Value of b is::" +b);
		//append a and b
		a=a+b;
		//Store initial string a in string b:
		b=a.substring(0,a.length()-b.length());
		
		//3.Store initial string b in stfing a
		a=a.substring(b.length());
		System.out.println("The Value of a and b after swapping::");
		System.out.println("The Value of a is:"+a);
		System.out.println("The Value of b is:"+b);

	}

}
