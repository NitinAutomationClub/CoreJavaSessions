package day2;
/*Three type of Variable
 * 1. Global Variable/Instance Variable: Define at class level.Access through out the program
 * 2. Local Variable: Access within the the program ,but we can access through object
 * 3. Static Variable : Define within the class but outside the method
 *
 */

public class Variables {
	
	//Global Variable
	int a=10;

	String name="Nitin";

	public void  test()
	{
		int k=20;//Local Variable
		
		System.out.println("Inside the Method"+k);
	
	}
	public void sum()
	{
		System.out.println("Before calculation "+a);//10
		int a=20;
		int j=30;
		System.out.println("Inside Sum "+a);//20
		int c=a+j;
		System.out.println("Value of C"+ c);//50
		
	}
	
	public static void main(String[] args) {
		int j=30;//Local varibale
		
		Variables obj=new Variables();
		
		System.out.println(obj.a);
		System.out.println(obj.name);
	
		
		obj.test();
		
		System.out.println(j);
		System.out.println("***********");
		obj.sum();	
		System.out.println(obj.a);//10
		
		
		
		

	}

}
