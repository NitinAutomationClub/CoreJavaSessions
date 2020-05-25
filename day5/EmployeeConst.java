package day5;

public class EmployeeConst {
	String name;
	int id;
	
	
	public EmployeeConst(String name, int id)
	{
		this.name=name;
		this.id=id;
	
		System.out.println(name + id);
		
	}
	/*public void display()
	{
		System.out.println(name + id);
	}*/

	public static void main(String[] args) {
		//We have reduced the LOC 
		EmployeeConst e1=new EmployeeConst("Jaspreet",101);//
		//e1.display();
		EmployeeConst e2=new EmployeeConst("Muneesh",201);
		//e2.display();
		EmployeeConst e3=new EmployeeConst("Nitin",301);
		//e3.display();
	
			
		
	}

}
