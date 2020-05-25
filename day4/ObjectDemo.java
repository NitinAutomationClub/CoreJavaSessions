package day4;

public class ObjectDemo {

	public static void main(String[] args) {
		//String obj[]=new String[4];
		
		
		Object data[]=new Object[4];
		data[0]="Core Java"; //1
		data[1]=10;   //2
		data[2]='A';//3
		data[3]=12.5;//4
		
		System.out.println(data[1]);
		int len=data.length;
		
		System.out.println("Object Array Length : "+ len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println(data[i]);
		}
		
		
	}

}
