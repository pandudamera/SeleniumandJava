package icici.loan.homeloan;

public class Student1 {
	int sno;
	String sname;

	public Student1(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		
		return "Student1 [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) {
		Student1 s = new Student1(1, "Pandu");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		System.out.println(s); //Hashcode
		Student1 s1 = new Student1(10, "s1");
		Student1 s2 = new Student1(20, "s2");
		Student1 s3 = new Student1(30, "s3");
		//Student1 s4 = new Student1(40, "s3");
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);*/
		Student1 st[]=new Student1[4];
		st[0]=s;
		st[1]=s1;
		st[2]=s2;
		st[3]=s3;
		for(Student1 t:st)
		{
			System.out.println(t);
		}

	}

}
