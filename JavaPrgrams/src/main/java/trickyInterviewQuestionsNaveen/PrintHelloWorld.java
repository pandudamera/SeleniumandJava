package trickyInterviewQuestionsNaveen;

public class PrintHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print Hello world without using semi coln(;)
		// First Solution
		if(System.out.printf("Hello World" + "\n")==null)
		{

	}
    // Second Solution
	if(System.out.append("Hello World" + "\n")==null)	
	{
}
	// Third Solution
	if(System.out.append("Hello World" + "\n").equals(null))
	{
}
	//Fouth Solution
	for(int i=0;i<1;System.out.println("Hello World"))
	{
		i++;
	}
}
}
