package csc123;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;


public class FileCopy {
	 public static void main(String [] args)throws FileNotFoundException{
	        Scanner input = new Scanner (System.in);
	        System.out.println("Enter a Source File");
	        String sourceFile = input.nextLine();
	        File file = new File(sourceFile);
	        Scanner scan = new Scanner(file);
	        System.out.println("Enter a Target File");
	        String targetFile = input.nextLine();
	        File tarfile = new File(targetFile);
	        ArrayList<String>arr=new ArrayList<String>();
	        if (!file.exists()){
	            System.out.println("Error has occured");
	            System.exit(0);
	        }
	        if(file.isDirectory()||tarfile.isDirectory()){
	            System.out.println("Error has occured");
	            System.exit(0);
	        }
	        while (scan.hasNextLine()){
	            String save = scan.nextLine();    
	            arr.add(save);
	            if (tarfile.exists()){
	                System.out.println("File already exist.");
	            }
	            else{
	                try
	                {
	                    tarfile.createNewFile();
	                    PrintWriter pw = new PrintWriter(tarfile);
	                    pw.println(arr);
	                    pw.close();
	                }
	                catch (java.io.IOException ioe)
	                {
	                    ioe.printStackTrace();
	                    
	                    
	                } 
	            }
	            
	        }

	    }
	}
	
