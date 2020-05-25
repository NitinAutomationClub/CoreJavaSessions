package day5;

public class ConstrutorNoArgWithArg {
	String name;
	int id;
	
	public ConstrutorNoArgWithArg()//User defined constuctor with no arg
	{
		System.out.println("Constructor without Arg");
		
	}
	
	public ConstrutorNoArgWithArg(String name, int id)//User defined constuctor with  arg
	{
		System.out.println("Constructor with Arg");
		
		
	}
	/*public void display()
	{
		System.out.println(name + id);
	}*/

	public static void main(String[] args) {
		
		ConstrutorNoArgWithArg e1=new ConstrutorNoArgWithArg("Jaspreet",101);//
		
		ConstrutorNoArgWithArg e2=new ConstrutorNoArgWithArg("Muneesh",201);
		
		ConstrutorNoArgWithArg e3=new ConstrutorNoArgWithArg("Nitin",301);
		
		ConstrutorNoArgWithArg e4=new ConstrutorNoArgWithArg();
	
			
		
	}

}
