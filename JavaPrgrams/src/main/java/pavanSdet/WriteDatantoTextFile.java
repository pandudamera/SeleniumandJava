package pavanSdet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatantoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("C:\\Users\\pandu.damera\\Documents\\Test12.txt");
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("Selenium With Java");
		bw.write("Selenium With Python");
		bw.write("Selenium With C#");
		System.out.println("Finished::");
		bw.close();

	}

}
