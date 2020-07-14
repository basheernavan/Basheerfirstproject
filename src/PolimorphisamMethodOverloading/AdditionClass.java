package PolimorphisamMethodOverloading;

public class AdditionClass {
	
	public static void sum(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b, int c){
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void sum(int a, int b, int c, int d){
		int e=a+b+c;
		System.out.println(e);
	}
}
