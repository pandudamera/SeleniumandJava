package pavanSdet;

public class RemoveWhiteSpacesinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java    Programming    Selenium    Automation";
		System.out.println("Before Removing white space in string::"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After Removing white space in string::"+str);

	}

}
