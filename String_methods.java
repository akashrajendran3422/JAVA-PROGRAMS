package javaprogram;

public class String_methods {

	public static void main(String[] args) {
		
		String name ="akashRajendran";
		String name1="suresh";
		
		System.out.println("HASH CODE         ="+name.hashCode());
		System.out.println("CHAR AT           ="+name.charAt(3));
		System.out.println("STARTWITH VALUES  ="+name.endsWith("H"));
		System.out.println("INDEXOFF          ="+name.indexOf("R"));
		System.out.println("LASTINDEXOFF      ="+name.lastIndexOf("a"));
		System.out.println("TO UPPERCASE      ="+name.toUpperCase());
		System.out.println("TO LOWERCASE      ="+name.toLowerCase());
		System.out.println("ASCII FORMATE     ="+((char)('a'-32)));
		System.out.println("EQUALS            ="+name1.equals("suresh"));
		System.out.println("EQUALS IGNORECASE ="+name1.equalsIgnoreCase("SURESH"));
		System.out.println("CONCATNATION      ="+name1.concat("concat"));
		System.out.println("CONTAINS          ="+name1.contains("sur"));
		System.out.println("SUB STRING        ="+name1.substring(1));
		System.out.println("SUB STRING        ="+name1.substring(0,4));
		System.out.println("JOIN              ="+name1.join("/","03","04","2002"));
		
		
		int no=5;
		char[] ch= {'a','b','c'};
		System.out.println("VALUEOF           ="+String.valueOf(ch)+no);
		
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		
        System.out.println(">>>ASCII FORMATE IN LOOPING<<<");
		
        for(int i=0;i<name1.length();i++)
			System.out.print((char)(name1.charAt(i)-32));
	        System.out.println();
		
	    System.out.println("------------------------------------------------------");
			     
	        
		for(int i=0;i<name.length();i++)
		{
			char s=name.charAt(i);
			if(s>='a' && s<='z')
			System.out.print((char)(name.charAt(i)-32));
			else
				System.out.print(name.charAt(i));
		}
		
}

}
