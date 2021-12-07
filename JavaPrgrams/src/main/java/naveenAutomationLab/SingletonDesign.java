package naveenAutomationLab;

public class SingletonDesign {
	
	
	//In OOP , a singleton class is a class that can have only once object (instance of the class)at a time
	//How to design singleton class
	//1.Make Constructor as private 
	//2.write public static method (getInstance) that has return type of object of this singleton class(lazy initialization )
	
	//Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, 
	//For normal class we use constructor, whereas for singleton class we use getInstance() method.
	private static SingletonDesign singleton_instance=null;
	public String str;
	
	private SingletonDesign()
	{
		str="Hey I am using Singleton Patten class";
		
	}
	
	public static SingletonDesign getInstance()
	{
		if(singleton_instance==null)
			singleton_instance=new SingletonDesign();
		return singleton_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonDesign x=SingletonDesign.getInstance();
		SingletonDesign y=SingletonDesign.getInstance();
		SingletonDesign z=SingletonDesign.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
