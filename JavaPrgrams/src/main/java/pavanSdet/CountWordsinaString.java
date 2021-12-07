package pavanSdet;

import java.util.Scanner;

public class CountWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String::");
		String n = sc.next();
		//int n=sc.nextInt();
		int count = 1;
		for (int i = 1; i < n.length() - 1; i++) {
			if ((n.charAt(i) == ' ') && (n.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number Words in a string::" + count);

	}

}
