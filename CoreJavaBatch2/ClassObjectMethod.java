package day1;

public class ClassObjectMethod {
	
	/*Class : 
	 * 1. It is the collection of Object and Method
	 * 2.It's not a a real world entity
	 * it doesn't occupy any space
	 * Example : Animal
	 * 
	 *  Object :
	 *  1. It's a real world entity
	 *  2.It's occupy space
	 *  example : Dog , Cat
	 *  
	 *  Method: A set of code which perform a particluar task.
	 *  
	 * 
	 */

	
	public void eat()
	{
		System.out.println("I am eating");
	}
	
	public void run()
	{
		System.out.println("I am running");
	}
	
	public static void main(String[] args) {
		
//class name refereceVariable=new class name;
		
		
		ClassObjectMethod obj=new ClassObjectMethod();
		obj.eat();
		obj.run();

		
		
	}

}
