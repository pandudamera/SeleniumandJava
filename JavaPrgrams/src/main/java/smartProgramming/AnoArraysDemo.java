package smartProgramming;

public class AnoArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnoArraysDemo.sum(new int[][]{{10,20,30},{40,50}});

	}
	public static void sum(int[][] no) {
		int total=0;
		for(int ii[]:no)
		{
			for(int i:ii)
			{
				total=total+i;
			}
		}
		System.out.println("Sum is::" +total);
		
	}

}
