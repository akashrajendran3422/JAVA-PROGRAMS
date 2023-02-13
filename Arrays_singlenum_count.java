package javaprogram;

public class Arrays_singlenum_count {

	public static void main(String[] args) 
{	
		int []a= {10,20,30,10,10,20,30,30,30,30,10,20,20,30};
		int key=30;
		int count=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(key==a[i]) 
			{
				count++;		
			}
		}
		System.out.println(count);
}
}
