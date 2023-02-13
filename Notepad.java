package javaprogram;

public class Notepad {

	 String name;
	public static void main(String[] args) 
	{
		int no=1;
		int primecount=0;
		while(no<=20)
		{
			int div=2;
			int count=0;
			while(div<no)
			{
				if(no%div==0) {
					count++;
				}
				div++;
			}
			if(count==0)
			{
				System.out.println(no+"is a prime number");
				primecount++;
				
			}
			no++;
			
		/*int no2=0;
		while(no2<3)
		{
			int no1=5;
			while(no1>=0)
			{
				System.out.print(no1);
				no1--;
			}
			System.out.println("");
			System.out.println(no2);
			no2++;*/
		
		}
	}
		
	}

