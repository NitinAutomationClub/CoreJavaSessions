package day5;

/*Constructor
 * 1. It is block which is very  similar to methods but having same name as class name 
 * 2. Constructor dont have any return type not even void 
 * 3. Access Modifier : Private , Public ,Protected , default 
 * 4. But we can't use as static or final beforre constructor name
 * 5.How we can call constructor : When we create Object it automatically call the constructor
 * 6. How create constructor : Compiler Not JVM
 * 
 * 7. Types of Constuctor : 
 * a. Default Constructor
 * b. User defined constructor with No Arguments
 * c. User defined constructor with Argument
 * 
 * 
 */

public class Constructor_Demo {
	//User defined constructor with No Arguments
	/*public  Constructor_Demo()
	{
		System.out.println("Inside Constructor");
		
	}
*/
	//Internally define not visibvle to user
	/*public Constructor_Demo()
	{
		super();
		
	}*/
	public void show()
	{
		System.out.println("Inside Method");
	}
	public static void main(String[] args) {
		
		
		Constructor_Demo obj=new Constructor_Demo();//It call constructor automatically
		
		obj.show();//Method calling
	}

}
