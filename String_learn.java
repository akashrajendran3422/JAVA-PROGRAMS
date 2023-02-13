package javaprogram;

public class String_learn {

	public static void main(String[] args) {
		
		String name="CHANDRUSARAVANAN";
		System.out.println(name);
		System.out.println("--------------------");
		
		String name1=new String("AKASH");
		System.out.println("charAt methods = "+name1.charAt(3));  //charAt single value
		System.out.println("--------------------");               //print STRING value in charAt
		
		for(int i=0;i<name1.length();i++) 
		{                                                             //print STRING total value in charAt
		System.out.println("charAt total value = "+name1.charAt(i));   //charAt total value
		}
		
		System.out.println("--------------------");
		
		for(int i=name1.length()-1;i>=0;i--) 
		{                                                              //print STRING total revers value
		System.out.println("charAt total value in reverse = "+name1.charAt(i));   //charAt total value
		}
		
	
		System.out.println("--------------------");
		System.out.println("STARTWITH VALUES = "+name1.endsWith("H"));  //print STARTWITH value
		
		System.out.println("--------------------");
		System.out.println("INDEXOFF = "+name1.indexOf("K"));
		
		System.out.println("--------------------");
		System.out.println("LASTINDEXOFF = "+name1.lastIndexOf("A"));
		
		System.out.println("--------------------");
		System.out.println("TO UPPERCASE = "+name1.toUpperCase());
		
		System.out.println("--------------------");
		System.out.println("TO LOWERCASE ="+name1.toLowerCase());
	}

}
