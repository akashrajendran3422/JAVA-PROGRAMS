package javaprogram;

public class Binarysearch {

	public static void main(String[] args) {
		
		int givenno=90;
		int[]arr= {10,20,30,40,50,60,70,80,90};
		int start=0,end=arr.length-1;
		
		
		System.out.println(">>>BINARY SEARCH<<<");
		System.out.println("ENTER THE VALUE = "+givenno);
		
		while(true) {
			
			
			int mid=(start+end)/2;
			
			if(givenno==arr[mid]) {
				System.out.println("NUMBER IS PRESENTED ="+mid);
				break;
			}
			
			 else if(givenno<arr[mid]) {
				end=mid-1;	
			}
			 else if(givenno>arr[mid]) {
				 start=mid+1;
			 }
			  if(start>end)
			 {
				 System.out.println("NUMBER IS NOT PRESENTED");
				 break;
			 }
			 
		}
		
}

}
