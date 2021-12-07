package fileHandlingNaveen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	/*Create a file in Java using
	
	1. File
	2.File)utStream
    3. Java NIO utils*/
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\pandu.damera\\Downloads\\FileHandle\\sample.txt";
		
		// 1. Using File:
		
		File f=new File(path);
        try {
			boolean flag=f.createNewFile();
			if(flag)
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already present----");
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        // 2.File  output stream a long with scanner
        
        try
        {
        	Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the file name with location path");
        String fileName=sc.nextLine();
       
			FileOutputStream fos=new FileOutputStream(fileName,true);
			System.out.println("Enter the file content");
			String content=sc.nextLine();
			byte b[]=content.getBytes();
				fos.write(b);
				fos.close();
				System.out.println("File is saved on the given location path");
			} 
        catch (Exception e) {
				// TODO Auto-generated catch block
        	System.out.println("Some exception is coming....");
				e.printStackTrace();
			}
        System.out.println("********************************");
        // 3.Java NIO package
        
        try
        {
        	Path pathLocation=Paths.get("C:\\\\Users\\\\pandu.damera\\\\Downloads\\\\FileHandle\\\\newFile.txt");
        
        Path newPath= Files.createFile(pathLocation);
			System.out.println("New File is created...." +newPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
        
		} 
        
	

}
