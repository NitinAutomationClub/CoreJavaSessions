package day5;

public class StaticConsObjectCount {
	static int count=0;
	StaticConsObjectCount()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		

		
		StaticConsObjectCount obj1=new StaticConsObjectCount();
		
		StaticConsObjectCount obj2=new StaticConsObjectCount();
		StaticConsObjectCount obj3=new StaticConsObjectCount();
		StaticConsObjectCount obj4=new StaticConsObjectCount();
		StaticConsObjectCount obj5=new StaticConsObjectCount();
		
	}

}
