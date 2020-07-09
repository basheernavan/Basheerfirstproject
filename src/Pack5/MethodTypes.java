package Pack5;

public class MethodTypes {
	
	int a=12, a1=10;
	char c='G', c1='8';
	double d=10.5,d1=45.8;
	boolean b=true, b1=false;
	String str1="selenium", str2="automation";
	
	public void test1(){  //void mean there is no return type.
		System.out.println("Void type method");
	}
	
	//integer type method: it can return only integer.
	public int test2(){
		System.out.println("lsadfksjdf ");
		return a;		
	}
	
	//char type methods:
	public char test3(){
		return c;		
	}
	
	//boolean type methods:
	public boolean test4(){
		return b;		
	}
	
	//double type method:
	public double test5(){
		return d;		
	}
	
	//String type method:
	public String test6(){
		return str2;		
	}
	
}
