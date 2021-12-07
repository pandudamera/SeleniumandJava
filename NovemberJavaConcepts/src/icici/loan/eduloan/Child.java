package icici.loan.eduloan;

public class Child extends Parent // ISA Relationship
{

	protected void m6()

	{
		System.out.println("I am m6 method child class overriding:");
	}

	public void m7()

	{
		System.out.println("I am m7 method child class:");
	}

	public Integer workHard()

	{
		System.out.println("Child: Wake up eagarly,goto college ");
		return 0;
	}

	public static void main(String[] args) {

		Parent ob = new Parent();
		ob.m6(); // HASA Relationship

		Child obj = new Child();
		obj.m6();
		obj.m7();
		obj.workHard(); // Object class supper , Number sub class , Integer  Sub class 
		// We can use parent class reference variable to refer/hold child class object
		Parent obj1 = new Child(); // Upcasting
		obj1.m6();
		Child obj2 = (Child) obj1;
		obj2.m6();
		obj2.m7();
		// We cannot use child class reference variable to hold parent class object

		/*
		 * Child c=(Child) new Parent(); Child d=c; d.m6(); d.m7(); // Runtime we will
		 * get exception java.lang.ClassCastException
		 */
	}

}
