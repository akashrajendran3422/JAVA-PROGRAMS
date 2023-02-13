package javaprogram;

public class Twodimentional {

	public static void main(String[] args) {
		
		              //C0 C1 C2  C3 C4
			int [][]m= {{20,30,40,50,60},//R0
					    {70,80,90,100,110},//R1
					    {120,130,140,150,160}};//R2
			int count=0;
			//System.out.println(m[0][0]);
			//System.out.println(m[1][1]);
			//System.out.println(m[2][2]);
			
			for(int row=0;row<m.length;row++)
			  {
			for(int col=0;col<m[row].length;col++) 
			  {
			//if(row==col)
			  //{
				//System.out.println(m[row][col]);
			  //}
			
				
			if(m[row][col]<90) 
			  {
				count++;
			  }
			   System.out.print(m[row][col]+" ");
			  }
			   System.out.println(" "); 
			  }
			System.out.println("COUNT="+count);

}
}
