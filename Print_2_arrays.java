package javaprogram;

public class Print_2_arrays {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8,9,10};
		int [] c= new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++) 
		{
			c[i]=a[i];
			System.out.println(c[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];	
			System.out.println(c[i]);
		}	

	}

}
