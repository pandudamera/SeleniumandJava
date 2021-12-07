package pavanSdet;

public class ReverseEachWordinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Java";
		String[] word = str.split("\\s");
		String rev = "";
		for (String w : word) {
			StringBuilder s = new StringBuilder(w);
			s.reverse();
			rev = rev + s.toString() + " ";
		}

		System.out.println("Reverse Word of String::" + rev);
	}

}
