package day5;

public class Employee2 {
	String name;
	int id;

	public void empDetails(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(name + id);
	}
	
	public static void main(String[] args) {
		
		Employee2 e1=new Employee2();//Emp1
		e1.empDetails("Jaspreet", 101);
		
		
		Employee2 e2=new Employee2();
		e2.empDetails("Nitin", 201);
		
		
		Employee2 e3=new Employee2();
		e3.empDetails("Muneesh", 301);
		
			
		
	}

}
