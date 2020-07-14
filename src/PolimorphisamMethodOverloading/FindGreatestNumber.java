package PolimorphisamMethodOverloading;

public class FindGreatestNumber {
	
	public static void greatestNumber(int a, int b){
		if(a>b){
			System.out.println("a is the greatest number: "+a);
		}else{
			System.out.println("b is the greatest number: "+b);
		}
	}
	
	
	public static void greatestNumber(int a, int b, int c){
		if(a>b && a>c){
			System.out.println("a is the greatest number: "+a);
		}else if(b>c){
			System.out.println("b is the greatest number: "+b);
		}else{
			System.out.println("c is the greatest number: "+c);
		}
	}
	
	public static void greatestNumber(int a, int b, int c, int d){
		if(a>b && a>c && a>d){
			System.out.println("a is the greatest number: "+a);
		}else if(b>c&& b>d){
			System.out.println("b is the greatest number: "+b);
		}else if(c>d){
			System.out.println("c is the greatest number: "+c);
		}else{
			System.out.println("d is the greatest number: "+d);
		}
	}
}
