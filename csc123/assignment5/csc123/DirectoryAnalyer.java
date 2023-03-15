package csc123;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.PrintWriter;

public class DirectoryAnalyer {
	
	public static void main (String [] args)throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name:");
        String x = input.nextLine();
        File file = new File(x);
       
        
        Scanner scan = new Scanner(file);
       int alphCount =0;
       int numCount =0;
       int spaceCount = 0;
        while(scan.hasNext()){
            String line = scan.next();
            for(int i =0; i < line.length();i++){
            char  c = line.charAt(i);
            if(Character.isLetter(c)){
        
                alphCount++;
            }
            
        }
        for(int i =0; i < line.length();i++){
            char  c = line.charAt(i);
            if(Character.isDigit(c)){
        
                numCount++;
            }
            
        }
        for(int i =0; i < line.length();i++){
            
            if(Character.isSpaceChar(line.charAt(i))){
        
                spaceCount++;
            }
            
        }
    }
        System.out.println("Alpha number is: " + alphCount);
        System.out.println("Numeric number is: " + numCount);
        System.out.println("Space number is: " + spaceCount);
        long size = x.length();
        System.out.println("Size of the file is: " + size + " bytes");
    }
}


}
