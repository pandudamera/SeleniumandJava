package trickyInterviewQuestionsNaveen;

import java.lang.reflect.Field;

public class AutoBots {
	// Create String Translator
	static
	{
		
		
			try {
				Field value=String.class.getDeclaredField("value");
				value.setAccessible(true);
				value.set("Hello Pandu", value.get("Hola Shashi"));
				value.set("Good Morning", value.get("Buenos días"));
				value.set("How have you been?", value.get("¿Cómo has estado?"));
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello Pand");
    System.out.println("Good Morning");
    System.out.println("How have you been?");
	}

}
