package naveenAutomationLab;

public class TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Main Method-1::");
		main("Testing");
		main(10);
		main(20, 30);

	}

	public static void main(String args) {

		System.out.println("The Main Method-2::");
	}

	public static void main(int a) {

		System.out.println("The Main Method-3::");
	}

	public static void main(int a, int b) {

		System.out.println("The Main Method-4::");
	}
}
