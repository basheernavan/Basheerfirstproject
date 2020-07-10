package Pack5;

public class StaticNonStatic {
	
	//Non-static variables declaration:
	public int a1=12;
	public int a2=23;
	private int b1=54;
	private int b2=76;
	
	//Static variables declaration:
	public static int c1=40;
	public static int c2=25;
	private static int d1=34;
	private static int d2=65;
	
	public void test1(){
		System.out.println("Executing public non-static method test1");
	}
	
	public void test2(){
		System.out.println("Executing public non-static method test2");
	}
	
	public static void test3(){
		System.out.println("Executing public static methods test3");
	}
	
	public static void test4(){
		System.out.println("Executing public static methods test4");
	}
	
	private void test5(){
		System.out.println("Executing private non-static methods test5");
	}
	
	private void test6(){
		System.out.println("Executing private non-static methods test6");
	}

	private static void test7(){
		System.out.println("Executing private static methods test7");
	}
	
	private static void test8(){
		System.out.println("Executing private static methods test8");
	}
	
	public static void main(String[] args) {
		test3();
		test4();
		test7();
		test8();
		
		//To call private non-static methods we need to create the object
		StaticNonStatic ssn = new StaticNonStatic();
		ssn.test5();
		ssn.test6();
		System.out.println(ssn.b1);
		System.out.println(ssn.b2);
		System.out.println(ssn.d1);
		System.out.println(ssn.d2);
		ssn.test1();
		ssn.test2();
		
	}
	
	
	
	
	
}
