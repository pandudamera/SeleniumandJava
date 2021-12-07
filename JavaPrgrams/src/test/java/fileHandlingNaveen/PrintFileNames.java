package fileHandlingNaveen;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {
	
	// Print all file names and folders in a directory in sorted order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\\\Users\\\\pandu.damera\\\\Downloads";
		
		File f=new File(path);
		File downloadDirectory[]=f.listFiles();
		Arrays.sort(downloadDirectory);
		for(File e:downloadDirectory)
		{
			if(e.isFile())
			{
				System.out.println("File" +e.getName()+ " " +e.getAbsolutePath());
			}
			else if(e.isDirectory())
			{
			System.out.println("Directory:" +e.getName()+ " " +e.getAbsolutePath());
		}
			else 
			{
			System.out.println("Not Known:" +e.getName()+ " " +e.getAbsolutePath());
		}

		}

	}

}
