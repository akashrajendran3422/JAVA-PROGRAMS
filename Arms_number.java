package javaprogram;

public class Arms_number {

	public static void main(String[] args) {
		
		
		int no=1634,arms=0,rem,no2=no,count=0;
		
		while(no>0)
		{
			rem=no%10;
			
			rem=rem*rem*rem*rem;
			arms=arms+rem;
			no=no/10;
			count=count+1;
		}
			System.out.println("COUNT=="+count);	
		System.out.println("ARMSTRONG=="+arms);
		if(no2==arms)
			System.out.println(arms+"==given num is armstrong");
		else
			System.out.println(arms+"==given num is not armstrong");
				
	}

}
