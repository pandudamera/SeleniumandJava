package pavanSdet;

public class CountOccurrencesofaCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Prpgramming Java OOPs";
		int totalcount=str.length();
		int totalcountafterremoving=str.replace("a", "").length();
		int count=totalcount-totalcountafterremoving;
		System.out.println("Count Occurrences of a Character in a String:"+count);

	}

}
