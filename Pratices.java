package javaprogram;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pratices {
	 
	public static void main(String[] args) throws IOException   { 
		
               File all=new File("/home/akash/Documents/akash.txt") ;
               all.createNewFile();
               
               FileWriter pen=new FileWriter(all,true);
               pen.write("AKASH");
               pen.write(" RAJENDRAN");
               
               pen.write(System.lineSeparator());
               pen.write("B.SC.COMPUTER SCIENCE");
		       pen.flush();
               pen.close();
               
               FileReader read1=new FileReader(all);
               int i;
               while((i=read1.read())!=-1) {
               System.out.print((char)i);
              // read1.read();
               
}
}
	
}		      
		  

		
		



