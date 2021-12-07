package trickyInterviewQuestionsNaveen;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(main.x);
		//System.out.println(main.y);

	}

}
class main{
	public static final int x=100;
	//public static int y=100;
	
	static {
		System.out.println("main--class static block--");
	}
}