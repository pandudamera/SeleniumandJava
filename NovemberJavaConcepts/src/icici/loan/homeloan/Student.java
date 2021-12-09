package icici.loan.homeloan;

public class Student {

	int sid;
	String sname;
	int marks;

	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		System.out.println("******** Student Details************");
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Student marks:" + marks);
	}

	public void assign(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public void display() {
		System.out.println("******** Student Details************");
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Student marks:" + marks);
	}

	public static void main(String[] args) {
		Student s = new Student(101, "Pandu", 98);
		s.assign(102, "Shashi", 70);
		s.display();

	}
}
