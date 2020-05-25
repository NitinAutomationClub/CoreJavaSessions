package day2;

public class StaticVar {

	
	String name="Core Java";//Non Static variable you can say simple class variable
	

	static int j=20;//Static Variable
	
	 public void run()//Non Static Method or simple method
	 
	{
		
		System.out.println("Inside Non Static Method");
		System.out.println(j);
	}
	
	public static void test()//Static Method
	{
		 
		
		System.out.println("Inside Static Variable");
		System.out.println(j);
	}
	
	
	public static void main(String[] args) {
		
		StaticVar obj=new StaticVar();
		
		System.out.println(j);//No need to to access with Object , either we can do 
		
		System.out.println(obj.name);//non static 
		
		obj.run();
		
		test();//direct calling //least recommended
		obj.test();// recomended
		StaticVar.test();// Highly recomended
		
		
		
		
		

	}

}
