package javaprogram;

public class Constructor {
	
	String name;
	int register,mark;
	
	public Constructor(String name1,int register1,int mark1)
	{
	name=name1;
	register=register1;
	mark=mark1;
	}
	

	public static void main(String[] args) {
		
		Constructor con=new Constructor("akash",1234,50);
		Constructor con1=new Constructor("arun",5678,10);
		Constructor con2=new Constructor("vaithi",9101,5);
		
		con.add();
		con1.add();
		con2.add();
	}
	public void add() {
		System.out.println(name);
		System.out.println(register);
		System.out.println(mark);
	}
	


}
