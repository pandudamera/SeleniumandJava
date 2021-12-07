package pavanSdet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\pandu.damera\\Documents\\Test.txt");
		Scanner sc=new Scanner(f);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		

	}

}
