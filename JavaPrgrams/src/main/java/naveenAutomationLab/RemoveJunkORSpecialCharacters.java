package naveenAutomationLab;

public class RemoveJunkORSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="基本库玛 latin string 0123456789";
		String s1="@#$! testing $%^&* Hari *&^";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
