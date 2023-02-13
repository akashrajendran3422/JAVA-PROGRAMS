package javaprogram;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("AKASH");
		al.add("RAJENDRAN");
		al.add(10);
		al.add(true);
		al.add(false);
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.contains("AKASH"));
		System.out.println(al.get(1));
		

	}

}
