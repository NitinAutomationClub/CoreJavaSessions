package day4;

public class ArrayDemo {

	public static void main(String[] args) {
	
		String name[]=new String[4];
		
		name[0]="Jaspreet";
		name[1]="Muneesh";
		name[2]="Nitin";
		name[3]="RajaShri";
	
		System.out.println(name[2]);
		
		int len=name.length;
		System.out.println("Length is "+ len);
		
		for (int i=0;i<len;i++)
		{
			System.out.println(name[i]);//name[0]=jaspreet,name[1]=Muneesh name[2]=Nitin name[3]="RajaShri";
		}
	
		System.out.println("Out of Loop");

	}

}
