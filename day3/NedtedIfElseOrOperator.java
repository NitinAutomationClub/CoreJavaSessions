package day3;

public class NedtedIfElseOrOperator {

	public static void main(String[] args) {
		int a=100;
		int b=500;
		int c=300;
		
		if(a>b && a>c) //false && false=false
		{
			System.out.println("A is Greater");
		}
		else if(b>a && b>c)//true && false=false
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
	}

}
