package javaprogram;

public class Prime_count {

	public static void main(String[] args) {
		
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
				System.out.println(no);
				primecount++;
				
			}
			no++;
				
		}

	}

}
