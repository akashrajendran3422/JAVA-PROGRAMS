package javaprogram;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		
		try {
			System.out.println(no1/no2);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("ENTER NO"); int
		 * no1=sc.nextInt(); int no2=sc.nextInt();
		 * 
		 * try { System.out.println(no1/no2); } catch(Exception i) //EXCEPATION {
		 * System.out.println(i); }
		 * 
		 * System.out.println(no1+no2); System.out.println(no1-no2);
		 * System.out.println(no1*no2);
		 */
		

	}

}
