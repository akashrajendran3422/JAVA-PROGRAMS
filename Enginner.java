package javaprogram;

public class Enginner extends Graduate{

	public static void main(String[] args) {
		
		Student obj1=new Enginner();
		obj1.study();                              //*OVERRIDE METHOD
		Enginner obj3= (Enginner)obj1;
		
		obj3.hashCode();
		System.out.println(obj3.hashCode());
		
		obj3.project();
		obj3.degree();
		obj3.akash();
		
		//obj1.study();
		
		//Student obj1=(Student) obj3;
		//obj1.akash();
		//*UP CASTING ANOTHER NAME *WIDE CASTING
		
		
	}
	public int hashCode() 
    {                                                         //*OVERRIDE METHOD
		return 123;
	}
    public void study() 
    {                                                         //*OVERRIDE METHOD
		System.out.println("OVERRIDE METHODS= "+"STUDY");	
	}
	public void project() 
	{
		System.out.println("GRANDPARENT = "+"B.SC.COMPUTER SCIENCE");
	}
	

}
