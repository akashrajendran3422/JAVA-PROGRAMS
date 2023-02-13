package javaprogram;

public class Printname {

	public static void main(String[] args) {
		for(int row=1;row<=8;row++){
			for(int col=1;col<=6;col++){
			if(row==1 && col>=1 && col<=5||col==1||row==4 && col>=1 && col<=5||
					col==6&&row>=2&&row<=3 || row-col==3)
					System.out.print("* ");
				else
					System.out.print("  ");  //LETTER *R*
				}
				System.out.println();
			}
			System.out.println("=============================================");
			
			for(int row=1;row<=9;row++){
				for(int col=1;col<=9;col++){
				if(row+col==6||col-row==4||row-col==4||col+row==14)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *A*
					}
					System.out.println();
				}
			System.out.println("=============================================");
			
			for(int row=1;row<=7;row++){
				for(int col=1;col<=6;col++){
				if(col==1||row+col==6||row-col==2)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *K*
					}
					System.out.println();
				}
			System.out.println("=============================================");
			
			for(int row=1;row<=5;row++){
				for(int col=1;col<=9;col++){
				if(row+col==6||col-row==4||col>=3&&row==4&&col<=7)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *A*
					}
					System.out.println();
				}
			System.out.println("=============================================");
			
			for(int row=1;row<=7;row++){
				for(int col=1;col<=6;col++){
				if(row==1||row==7||row==4||col==1&&row>=1&&row<=3||col==6&&row>=4&&row<=6)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *S*
					}
					System.out.println();
				}
			System.out.println("=============================================");
			
			for(int row=1;row<=7;row++){
				for(int col=1;col<=6;col++){
				if(col==1||col==6||row==4)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *H*
					}
					System.out.println();
				}
			System.out.println("=============================================");

			for(int row=1;row<=6;row++){
				for(int col=1;col<=7;col++){
				if(row==1||col==4||col<=3&&col>=2&&row==6||row==5&&col==2)
						System.out.print("* ");
					else
						System.out.print("  ");   //LETTER *J*
					}
					System.out.println();
				}
			System.out.println("=============================================");

	}

}
