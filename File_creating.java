package javaprogram;

import java.io.File;
import java.io.IOException;

public class File_creating {

	public static void main(String[] args) {
		
		File file=new File("/home/akash/Documents/RESUMES/file create.txt"); 
		  try {
		  file.createNewFile(); 
		  }                                   //FILE CREATION e.printStackTrace(); }
		  catch (IOException e) 
		  { 
			  System.out.println("d");
		  }

	}

}
