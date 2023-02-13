package javaprogram;

public class Whileloops {

	int frnd1=1;
	int frnd2=0;
	int frnd3=1;
	int frnd4=0;
	int frnd5=5;
	int frnd6=9;
	int frnd7=1;
	int frnd8=1;
	int frnd9=1;
	public static void main(String[] args)
	{
		Whileloops loop=new Whileloops();
		
		loop.straight();
		System.out.println("");
		System.out.println("-------");
		loop.right();
		
		System.out.println("-------");
		loop.back();
		
		System.out.println("-------");
		loop.left();
		System.out.println("");
		System.out.println("-------");
		loop.front();
		System.out.println("");
		System.out.println("-------");
		loop.side();
		System.out.println("");
		System.out.println("-------");
		loop.side2();
		System.out.println("");
		System.out.println("-------");
		loop.side3();
		System.out.println("");
		System.out.println("-------");
		loop.side4();
	}	
		
	public void straight()
	{
		while(frnd1<=20)
		{
			System.out.println(frnd1*5);
			
			frnd1=frnd1+1;
			
		}
	}
	public void left()
	{
		while(frnd2<5)
		{
			System.out.print(frnd2+" ");
			frnd2++;
			
		}
	}
	public void right()
	{
		while(frnd3<=5)
		{
			System.out.println(frnd3);
			frnd3++;
		}
	}
	public void back()
	{
		while(frnd4<5)
		{
			System.out.println(frnd4);
			
			frnd4++;
		}
	}
	public void front()
	{
		while(frnd5>=1)
		{
			System.out.print(frnd5+" ");
			
			frnd5=frnd5-1;
		}
	}
	public void side()
	{
		while(frnd6>=-1)
		{
			System.out.print(frnd6+" ");
			
			frnd6=frnd6-2;
		}
	}
	public void side2()
	{
		while(frnd7<=10)
		{
			System.out.println(frnd7+" * 3 = "+frnd7*3);
			
			frnd7=frnd7+1;
		}
	}
	public void side3()
	{
		while(frnd8<1000)
		{
			if (frnd8%5==0 && frnd8%3==0 && frnd8%7==0) {
			System.out.print(frnd8+" ");
			}
			frnd8=frnd8+1;
		}
	}
	public void side4()
	{
		while(frnd9<=120)
		{
			if (frnd9%2==0 )
			{
			System.out.println(frnd9+" ");
			}
			frnd9=frnd9+1;
		}
		
		

	}

}
