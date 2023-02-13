package javaprogram;

public class Divide_whileloop {

	public static void main(String[] args) {
		
		int no=50;
		int div=2;
		while(div<=50)
		{
			if(no%div==0)           
			{
				System.out.println(div);
			                           //break statement
			}
			div=div+1;
		}
		System.out.println("-----------------------------------------");
           int no2=50;
           int div2=2;
           while(div2<50)
           {
        	   if(no2%div2==0)
        	   {
        		   System.out.println(div2);
        	   }
        	   div2=div2+1;
           
           }
           System.out.println("-----------------------------------------");
           int no3=50;
           int div3=2;
           int greater=0;
           while(div3<50)
           {
        	   if(no3%div3==0)
        	   {
        		greater=no3;
        	   }
        	   div3=div3+1;
           
           }
           System.out.println(div3);  
           System.out.println("-----------------------------------------");
            int div4=1;
            int num1=37;
            int num2=566;
           int small=num1>num2?num1:num2;
           while(true)
            {
            	if(small%num1==0 && small%num2==0)
            	{
            		System.out.println("least common "+small);
            		break;
            	}
            	small=small+1;
            	
           }
	}

}
