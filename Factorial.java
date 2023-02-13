package javaprogram;

public class Factorial {

	public static void main(String[] args) {
		
		int no=3;
		int fact=no;
		do {
		no--;
		fact=fact*no;
		}
		while(no>1);
		{
		System.out.println(fact);
		}

	}

}
