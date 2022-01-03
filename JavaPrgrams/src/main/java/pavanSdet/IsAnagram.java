package pavanSdet;

import java.util.Arrays;

public class IsAnagram {

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
		return true;
	}

	public static void main(String[] args) {

		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");
	}

}