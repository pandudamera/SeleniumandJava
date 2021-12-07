package OOPsNaveen;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", marks=" + marks + ", age=" + age + "]";
	}
	private String name;
	private int rollnumber;
	private int marks;
	private int age;
	public Student(String name, int rollnumber, int marks, int age) {
	
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
