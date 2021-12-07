package trickyInterviewQuestionsNaveen;

import java.util.StringJoiner;

public class StringjoinerConcept {
	
	//What is StringJoiner? --in jdk 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner=new StringJoiner(",","[","]");
		joiner.add("Tom");
		joiner.add("Pandu");
		joiner.add("Shahsi");
		
		System.out.println(joiner.toString());

	}

}
