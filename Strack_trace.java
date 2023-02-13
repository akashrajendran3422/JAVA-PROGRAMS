package javaprogram;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Strack_trace {

	public static void main(String[] args) {
		
		Strack_trace obj=new Strack_trace();
		System.out.println(obj.first());
	}

	private int first()
	{
		return second();
	}
	private int second() 
	{
		return third();
	}
	private int third()
	{
		
		
	
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("ENTER NUMBER");
		  
		  try {
			  int no1=sc.nextInt(); 
			  int no2=sc.nextInt();
		  
		  System.out.println(no1/no2);
		  }
		  catch(Exception e) 
		  {
			  System.out.println(e);
			  }
		  finally {
			  System.out.println("finally");
			  }
		  
		  return 5 ;
		 
	}

}
