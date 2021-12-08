package icici.loan.eduloan;

public class EmployeeChild extends EmployeeParent {
	String city;

	public EmployeeChild(String city) {
		super(100, "Pandu", 20.21f);
		this.city = city;

		System.out.println(this.city);
	}

	public void m5() {

	}

	public static void main(String[] args) {
		EmployeeChild ec = new EmployeeChild("hyderabad");

	}

}