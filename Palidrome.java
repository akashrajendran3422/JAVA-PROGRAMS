package javaprogram;

public class Palidrome {

	public static void main(String[] args) {
		
		int no=16461;
		int total=0;             //palidrome program
		while(no>0)
		{
			total=(total*10)+(no%10);
			no=no/10;
			
		}
		System.out.println("print reserve "+total);             
		if(no==total)
		{
			System.out.println("given no is palidrome");
		}
		else
		{
			System.out.println("given no is not palidrome");
		}

	}

}
