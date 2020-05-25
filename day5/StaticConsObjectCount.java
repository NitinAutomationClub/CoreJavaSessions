package day5;

public class StaticConsObjectCount {
	static int count=0;
	StaticConsObjectCount()
	{
		count++;
	}

	public void totalCount()
	{
		System.out.println("Total Object created : "  + count);
	}
	public static void main(String[] args) {
			
		StaticConsObjectCount obj1=new StaticConsObjectCount();
		
		StaticConsObjectCount obj2=new StaticConsObjectCount();
		StaticConsObjectCount obj3=new StaticConsObjectCount();
		StaticConsObjectCount obj4=new StaticConsObjectCount();
		StaticConsObjectCount obj5=new StaticConsObjectCount();
		StaticConsObjectCount obj6=new StaticConsObjectCount();
		StaticConsObjectCount obj7=new StaticConsObjectCount();
		
		obj1.totalCount();
		
	}

}
