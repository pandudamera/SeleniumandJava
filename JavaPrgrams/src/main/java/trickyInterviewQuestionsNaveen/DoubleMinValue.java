package trickyInterviewQuestionsNaveen;

public class DoubleMinValue {
	
	/* What is the value of double MIN_VALUE?
	 * Which one is bigger-Double MIN_VALUE or 0.0d?
	 * Which one is bigger-Double MIN_VALUE or NEGATIVE_INFINITY?
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		System.out.println(Float.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

	}

}
