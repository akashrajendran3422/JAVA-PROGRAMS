package javaprogram;

public class Pratices2 {

	public static void main(String[] args) {
		
		Pratices2 obj2=new Pratices2();
		Pratices1 obj=new Pratices1();
		
		obj2.first(10,0);
		
	}
	
		public void first(int no,int no1) {
			try {
			System.out.println(no/no1);
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			
		}
		
	
}
