package javaprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_learn {

	public static void main(String[] args) throws IOException {
		
		File file=new File("/home/akash/Documents/Files.txt");
		file.createNewFile();
		
		
		FileWriter pen=new FileWriter(file,true);             //FILE WRITER
		BufferedWriter bw=new BufferedWriter(pen);
		bw.write(" ROLEX");
		bw.flush();
		
		
		pen.write("AKASH");
		pen.write(" RAJENDRAN");  
		                                     //CREATE A FILE AND PRINT THE ABC IN THAT FILES PAGE
		pen.write(System.lineSeparator());
		pen.write("AKASH");
		pen.write(" B.SC.CS");                   //CREATE A FILE AND PRINT THE ABC IN THAT FILES PAGE
		pen.flush();
		//pen.close();
		
		
		FileReader reader=new FileReader(file); 
		BufferedReader br=new BufferedReader(reader);
		//System.out.println((char)reader.read());                          //File READER
	    String word=br.readLine();
	    while(word!=null) {
		System.out.println(word);
		word=br.readLine();
	}
		/*
		 * int r=reader.read(); while(r!=-1) { System.out.print((char)r);
		 * r=reader.read(); }
		 */
	}

}
