package day3;

public class NedtedIfElse {

	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=300;
		
		if(a>b || a>c) //false ||false=false
		{
			System.out.println("A is Greater");
		}
		else if(b>a || b>c)//true || true=true
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
	}

}
