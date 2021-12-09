package icici.loan.homeloan;

public class SudentDetails {

	int sid;
	String sname;
	static String name = "Jaya Colleage";

	public SudentDetails(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
		System.out.println("******** Student Details************");
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Sudent College name:" +name);

	}

	public void assign(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	public void display() {
		System.out.println("******** Student Details************");
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Sudent College name:" +name);

	}

	public static void main(String[] args) {
		SudentDetails s = new SudentDetails(103, "Pandu");
		SudentDetails s1 = new SudentDetails(104, "Shashi");
		s.display();
		s1.display();
  
	}
}
