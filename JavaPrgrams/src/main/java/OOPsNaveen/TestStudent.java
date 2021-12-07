package OOPsNaveen;

import java.util.ArrayList;



public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1 =new Student("Pandu",1,90,15);
 Student s2 =new Student("Shashi",2,80,16);
 Student s3 =new Student("Sai",3,95,17);
 Student s4 =new Student("Ashish",4,100,15);
 Student s5 =new Student("Naveen",5,50,14);
 
 ArrayList <Student> studentList= new ArrayList<Student>();
 
 studentList.add(s1);
 studentList.add(s2);
 studentList.add(s3);
 studentList.add(s4);
 studentList.add(s5);
 
 System.out.println("Total Student:" +studentList.size());
 
 for(Student s:studentList)
 {
	 System.out.println(s);
 }
 
 System.out.println("*******************************");
 studentList.stream().forEach(e->System.out.println(e));
 
 // name ,where marks>80
 studentList.stream().filter(e->e.getMarks()>80).forEach(e->System.out.println(e.getName()+ ":" +e.getMarks()));
 
 // name, who is got highest marks
 
 int hm= studentList.stream().map(e->e.getMarks()).max(Integer::compare).get();
 System.out.println("Highest Marks" + hm);
 
 studentList.stream().filter(e->e.getMarks()==hm).forEach(e->System.out.println(e));
	}

}
