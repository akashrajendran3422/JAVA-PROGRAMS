package javaprogram;

public class Power_Base {

	public static void main(String[] args) {
		
		int base = 3, power = 4;

	    int result = (int) Math.pow(base, power);
	    System.out.println("Answer = " + result);
	    
	    
	    int base1 = 3,result1 = 1;
	     
		for(int power1=4;power1!=0;power1--) 
	    {
	      result1 *= base1;	     
	    }

	    System.out.println("Answer = " + result1);

	}

}
