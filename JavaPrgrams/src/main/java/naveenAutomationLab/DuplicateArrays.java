package naveenAutomationLab;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 4, 5, 1,4,5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate elements is:" + a[i]);
				}
			}
		}
	}
}