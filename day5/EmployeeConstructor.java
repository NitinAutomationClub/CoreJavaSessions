package day5;

public class EmployeeConstructor {
	String name;
	int id;

	public void empDetails(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(name + id);
	}
	
	public static void main(String[] args) {
		
		EmployeeConstructor e1=new EmployeeConstructor();//Emp1
		e1.empDetails("Jaspreet", 101);
		
		
		EmployeeConstructor e2=new EmployeeConstructor();
		e2.empDetails("Nitin", 201);
		
		
		EmployeeConstructor e3=new EmployeeConstructor();
		e3.empDetails("Muneesh", 301);
		
			
		
	}

}
