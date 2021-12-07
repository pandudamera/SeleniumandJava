package trickyInterviewQuestionsNaveen;


import java.util.Arrays;

public class ShiftZeroToRight {

	private static int[] shiftZeroToRight(int [] a) {
		if(a.length==1)
		{
			return a;
		}
		
		int newArra[]=new int[a.length];
		int count =0;
		for(int number:a)
		{
			if(number!=0)
			{
				newArra[count]=number;
				count++;
			}
		}
		return newArra;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] i=new int[] {1,0,2,0,3,0,0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		i=new int[] {0,1,0,2,0,3,0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {1,2,3,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {1,2,3};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {1};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {0,1,0,2,0,3};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
	}

}
