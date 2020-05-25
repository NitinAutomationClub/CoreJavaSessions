package day4;

public class ParmeterizedMethod {

	public void sum()
	{
		int a=20;
		int b=40;
		int c;
		c=a+b;
		System.out.println("Sum Method : "+c);
	}
	
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiply Method: "+c);
		
	}
	public static void main(String[] args) {
		
		ParmeterizedMethod obj=new ParmeterizedMethod();
		obj.sum();
		obj.sum();
		obj.mul(10,30);
		obj.mul(50, 70);
		
		obj.mul(2, 5);
		obj.mul(4, 5);
		
		
		
		

	}

}
