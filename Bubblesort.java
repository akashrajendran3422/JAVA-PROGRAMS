package javaprogram;

public class Bubblesort {

	public static void main(String[] args) {
		 
		 
         int[]a= {50,60,40,70,30,80,20,90,100,10};
         int add=1;
         while(add<=a.length-1) {
         int index=0;
         while(index<a.length-add)
         {
        	 if(a[index]>a[index+1])
        	 {
        		 int temp=a[index];
        		 a[index]=a[index+1];
        		 a[index+1]=temp;      		 
        	 }
        	 index++;
        	 
         }
       
         add++;
         
         }
         for(int i=0;i<a.length;i++) {
             System.out.println(a[i]);
         
         }
        
         
          
	}

}
