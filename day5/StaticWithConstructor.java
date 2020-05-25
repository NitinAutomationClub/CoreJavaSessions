package day5;

public class StaticWithConstructor {

	String name;
	int id;
	static String comp="Google";
	
	StaticWithConstructor(String name, int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(name +id+comp);
		
	}
	
	
	
	public static void main(String[] args) {
		
		StaticWithConstructor e1=new StaticWithConstructor("A",101);
		StaticWithConstructor e2=new StaticWithConstructor("B",102);
		StaticWithConstructor e3=new StaticWithConstructor("C",103);
				
	}

}
