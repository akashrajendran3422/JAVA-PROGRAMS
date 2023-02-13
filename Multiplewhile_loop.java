package javaprogram;

public class Multiplewhile_loop {

	public static void main(String[] args) {
		
		Multiplewhile_loop obj=new Multiplewhile_loop();
		
		obj.loop();
		System.out.println("======================");
		obj.loop2();
		System.out.println("======================");
		obj.loop3();
		System.out.println("======================");
		obj.loop4();
		}
		
		public void loop()
		{
			int no=1;
			while(no<1000)
			{
				if(no%3==0 && no%5==0 && no%7==0)
				System.out.println(no);
				no=no+1;
			}
		}
		public void loop2()
		{
			int no=1;
			while(no<=10)
			{
				//if(no%3==0)
				System.out.println(no+" * 8 = "+(no*8));
				no=no+1;
			}
		}
		public void loop3()
		{
			int no=1000;
			while(no>1)
			{
				if(no%3==0 && no%5==0 && no%7==0)
				System.out.println(no);
				no=no-1;
			}
		}
		public void loop4()
		{
			int no=100;
			while(no>1)
			{
				if(no%5==0)
				System.out.println(no);
				no=no-1;
			}

}

}


