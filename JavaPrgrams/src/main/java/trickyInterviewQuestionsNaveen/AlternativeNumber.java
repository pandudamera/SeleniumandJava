package trickyInterviewQuestionsNaveen;

public class AlternativeNumber {

	static void printAlter(int[] arr, int N)
	{
	     
	    // Print elements
	    // at odd positions
	    for(int currIndex = 0;
	            currIndex < N;
	            currIndex++)
	    {
	         
	        // If currIndex stores even index
	        // or odd position
	        if (currIndex % 2 == 0)
	        {
	            System.out.print(arr[currIndex] + " ");
	        }
	    }
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int[] arr = { 2,4,9 };
	    int N = arr.length;
	     
	    printAlter(arr, N);
	}
	}
	 