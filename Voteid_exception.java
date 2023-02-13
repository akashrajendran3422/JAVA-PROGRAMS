package javaprogram;

public class Voteid_exception extends RuntimeException {

	

	public void vote(int age)throws Voteid_exception
	{
		
	
		if(age<18) 
		{
			Voteid_exception ve=new Voteid_exception();
			throw ve;
		}
		else 
		{
			System.out.println("CAST YOUR VOTE");	
		}

}

}
