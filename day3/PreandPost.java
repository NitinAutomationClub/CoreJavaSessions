package day3;

public class PreandPost {

	public static void main(String[] args) {
		//PreIncrement: First it increment itself then it assign the value
		int a=1;
		int b=++a;//2
		System.out.println("Pre Increment");

		System.out.println(a);//2
		System.out.println(b);//2
		
		//Post Increment : First it assign the value then  it increment 
		int a1=1;
		int b1=a1++;
		System.out.println("Post Increment");
		System.out.println(a1);// 2
		System.out.println(b1);//  1
		
		//Pre Decrement : First it decrement itself then it assign the value
		int a2=1;
		int b2=--a2;
		System.out.println("Pre Decrement");
		System.out.println(a2);//0
		System.out.println(b2);//1
		
		//Post Decrement : First it assign the value then  it Decrement
		
		int a3=1;
		int b3=a2--;
		System.out.println("Post Decrement");
		System.out.println(a3);//1
		System.out.println(b3);//0
		
		
		

	}

}
