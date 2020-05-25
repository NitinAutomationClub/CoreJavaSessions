package day4;

/*No need to decalare  multiple variables
 * 
 * Disadvantages
 * Size is fixed
 * it store similar kind of data
 * 
 */

public class ArrayDemo2 {

	public static void main(String[] args) {
	
		String name[]=new String[4];
		
		name[0]="Jaspreet";
		name[1]="Muneesh";
		//name[2]="Nitin";
		name[3]="RajaShri";
	
		System.out.println(name[2]);
		
		int age[]=new int[3];
		age[0]=10;
		age[1]=20;
		age[2]=30;
		
		System.out.println(age[2]);
		System.out.println(age[3]);//Exeption ArrayIndex Outof Bound

	}

}
