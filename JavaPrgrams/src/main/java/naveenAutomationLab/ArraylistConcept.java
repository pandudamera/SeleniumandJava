package naveenAutomationLab;
import java.util.ArrayList;
import java.util.Iterator;;

public class ArraylistConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Test");
		a.add("Selenium");
		a.add("Car");
		a.add("Python");
		
		//1.Approach 
		a.forEach(shows->{
			System.out.println(shows);
		});
		System.out.println("#######################################");
 //2.Approach
		Iterator<String>it=a.iterator();
		while(it.hasNext())
		{
			String shows=it.next();
			System.out.println(shows);
			
		}
		System.out.println("#######################################");
		//3.For each Loop
		System.out.println("For Each loop");
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println("#######################################");
		//4.For loop
		System.out.println("For  loop");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
