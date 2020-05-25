package day5;

public class Employee {
	String name;
	int id;

	public static void main(String[] args) {
		//4*1000=4000 Line of Code 
		Employee e1=new Employee();//Emp1
		e1.name="Jaspreet";
		e1.id=101;
		System.out.println(e1.name);
		System.out.println(e1.id);
		
		Employee e2=new Employee();
		e2.name="Muneesh";
		e2.id=201;
		System.out.println(e2.name);
		System.out.println(e2.id);
		
		Employee e3=new Employee();
		e3.name="Nitin";
		e3.id=301;
		System.out.println(e3.name);
		System.out.println(e3.id);
		
		
	}

}
