package javaprogram;

import java.io.File;
import java.io.IOException;

public class Filescreate_onlyfiles_print {

	public static void main(String[] args) {
		
      File file=new File("/home/akash/");
		
	  File[] array=file.listFiles();       //print files 
		
		for(int i=0;i<array.length;i++)
		{
			if(!array[i].isDirectory())
			{
			String name=array[i].getName(); 
			int dot=name.lastIndexOf("."); 
			System.out.println(name.substring(dot));//print only filenames
			
		}
		}
	}

}
