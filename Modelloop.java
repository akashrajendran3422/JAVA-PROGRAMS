package javaprogram;

public class Modelloop {

	public static void main(String[] args) {
		
		Modelloop loop=new Modelloop();
		Modelloop loop2=new Modelloop();
		
		loop.add(12345);
		loop2.div(130);
	}	
		
		public void div(int i) {
	       int div=2;
	       int count=0;
	       while(div<i)
	       {
	    	   if(i%div==0) {
	    		   System.out.println(div+"");
	    	   count++;
	       }
	    	   div++;
	       }
	       System.out.println();
	       System.out.println(count);
		if(count==0)
		{
			System.out.println(i+" is a prime number");
		}
		else
		{
			System.out.println(i +"is not a prime number");
		}
	}

		public void add(int no) {
			
		
		int total=0;
		while(no>0)
		{
		System.out.print(no%10);    //reverse the given number
			//count=count+1;
			total=total+(no%10);
			no=no/10;
		}
		System.out.println("\n========================");
		System.out.println("\nSum of the given number: "+total);
		
		int sum=0;
		while(total>0) {
		sum=sum+total%10;
		total=total/10;

	}
		if(total>9)
			add(total);
		else
		System.out.println("\n========================");
        System.out.println("total num  "+ sum);

	}
	
}