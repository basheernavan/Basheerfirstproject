package Pack6;

import Pack5.StaticNonStatic;

public class CallMethods {
	public static void main(String[] args) {
		System.out.println(StaticNonStatic.c1);
		System.out.println(StaticNonStatic.c2);
		StaticNonStatic.test3();
		StaticNonStatic.test4();
		
		//Create Object for the class:
		StaticNonStatic sn = new StaticNonStatic();
		System.out.println(sn.a1);
		System.out.println(sn.a2);
		sn.test1();
		sn.test2();
	}
	
}