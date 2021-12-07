package trickyInterviewQuestionsNaveen;

public class MissingElements {
	
	// Find out missing element in an integer array
	
	// 1,2,3,4----100

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,2,3,4,5,7,8,9,10,11};
		int n1=findMissingelements(num, 11);
		System.out.println(n1);
	}

	public static int findMissingelements(int num[],int totalCount)
	{
		int expectedSum=totalCount*(totalCount+1)/2;
		int actualresult=0;
		
		for(int i:num)
		{
			actualresult+=i;
		}
		return expectedSum-actualresult;
	}
}
