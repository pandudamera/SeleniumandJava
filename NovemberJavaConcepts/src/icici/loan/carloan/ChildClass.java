package icici.loan.carloan;

public class ChildClass extends FirstAbtract {

	public static void main(String[] args) {
		
		ChildClass obj2=new ChildClass();
		obj2.m1();
		obj2.m2();

		

	}
	@Override
	public void m1() {
		
		System.out.println("I am m1 Override method in child class:");
		
	}

	@Override
	public void m2() {
		
		System.out.println("I am m2 Override method in child class:");
		
	}

}
