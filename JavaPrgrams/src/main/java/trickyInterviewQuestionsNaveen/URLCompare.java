package trickyInterviewQuestionsNaveen;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {
	
	// What will be the output when you compare site URL with it;s ip address

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
      //https://www.uptrends.com/tools/find-ip-address-of-my-website
		
		System.out.println(new URL("https://www.google.com/").equals(new URL("https://216.58.208.100")));
	}

}
