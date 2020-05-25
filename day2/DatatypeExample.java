package day2;

public class DatatypeExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		String x="Core";
		String y="Java";
		
		System.out.println(a+b);//30
		
		System.out.println(x);//Core
		System.out.println(y);//Java
		
		System.out.println(x+y);//CoreJava
		System.out.println(a+b+x);
		
		System.out.println(a+b+x+y);//30CoreJava
		
		System.out.println(x+y+a);
		System.out.println(x+y+a+b);//CoreJava30
		System.out.println(x+y+(a+b));//CoreJava30
		
		System.out.println(a+b+x+y+a+x+y+b);//30CoreJava10CoreJava20
		
		
		

	}

}
