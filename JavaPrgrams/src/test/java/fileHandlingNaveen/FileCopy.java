package fileHandlingNaveen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	/*File Handling -1
	Copy a file (pdf) and create a different file in the same location
	@param arg
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://www.africau.edu/images/default/sample.pdf
		
		copyFile();
	}
	public static void copyFile()
	{
		
		File fileinput=new File("C:\\Users\\pandu.damera\\Downloads\\sample.pdf");
		File fileout=new File("C:\\Users\\pandu.damera\\Downloads\\sample-copy.pdf");
		FileInputStream fi=null;
		FileOutputStream fo=null;
				try {
					fi=new FileInputStream(fileinput);
					fo=new FileOutputStream(fileout);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try
				{
					System.out.println(fi.available());
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
      int i=0;
      
      try {
		while((i=fi.read())!=-1)
		  {
			  fo.write(i);
		  }
	} catch (IOException e) {
		
		e.printStackTrace();
	}
      finally
      {
    	  if(fi!=null)
    	  {
    		  try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	  }
    	  if(fo!=null)
    	  {
    		  try {
				fi.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	  }
      }
	}

}
