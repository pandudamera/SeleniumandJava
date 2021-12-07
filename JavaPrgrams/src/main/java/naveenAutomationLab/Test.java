package naveenAutomationLab;

public class Test {

	int a = 100;
	

	static void add(int a) {
		Test t = new Test();
		System.out.println(t.a);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.add(10);
	}
}