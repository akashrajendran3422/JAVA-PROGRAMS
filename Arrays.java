package javaprogram;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		

			int [] marks= {90,80,70,60,50,40};
			int no=70;
			int count=0;
			for(int n = 0;n<marks.length;n++)
			{
				if(no==marks[n]){
					count++;
					System.out.println("Given no is present "+n);
				}
			}
			    if(count==0){
				System.out.println("given no is not present");
			    }
		}
		
		
	
	}
	/*
	 * Scanner sc=new Scanner(System.in); int marks=sc.nextInt(); int[] no=new
	 * int[marks];
	 * 
	 * for(int n=0;n<no.length;n++) { System.out.println("ENTER THE VALUE");
	 * no[n]=sc.nextInt(); } for(int no1=0;no1<no.length;no1++) {
	 * System.out.println(no[no1]); }
	 */




	
