package icici.loan.eduloan;

public class Encapsulation1 {

	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		obj.setAge(37);obj.setName("Pandu");
		System.out.println("Age is:" +obj.getAge());
		System.out.println("Name is:" +obj.getName());
		System.out.println("Class Name is:" +obj.getClass());
		System.out.println("To String method:" +obj.toString());
	}

}
